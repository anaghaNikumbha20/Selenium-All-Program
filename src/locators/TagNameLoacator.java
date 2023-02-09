package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLoacator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html%20elements/Demo1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("automation");
		Thread.sleep(2000);
		driver.close();
	}

}
