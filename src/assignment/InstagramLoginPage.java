package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Anuja123");
		driver.findElement(By.name("password")).sendKeys("anuja12345");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
