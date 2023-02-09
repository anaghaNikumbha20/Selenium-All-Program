package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/html%20elements/disable%20and%20unable.html");
		WebElement username = driver.findElement(By.id("i2"));
		WebElement password=driver.findElement(By.id("i3"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block is executed");
		}
		else
		{
			jse.executeScript("document.getElementById('i1').value='admin'");
			System.out.println("else block is executed");
		}
		
		Thread.sleep(2000);
		
		if(password.isEnabled())
		{
			password.sendKeys("manager");
			System.out.println("if block is executed");
		}
		else
		{
			jse.executeScript("document.getElementById('i3').value='manager'");
			System.out.println("else block is executed");
		}
	}
	

}