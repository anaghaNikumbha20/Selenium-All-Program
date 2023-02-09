package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAssignmentOnImplicitlyWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[test()='Core i7']")).click();
		driver.findElement(By.xpath("//div[test()='Brand']")).click();
		driver.findElement(By.xpath("//div[test()='HP']")).click();
		driver.findElement(By.xpath("//div[test()='Windows 10']")).click();
		//driver.findElement(By.xpath("//div[test()='']")).click();
		
	}

}
