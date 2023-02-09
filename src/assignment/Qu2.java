package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		System.out.println("---------------");
		Set<String> allhandle  =driver.getWindowHandles();
		Thread.sleep(2000);
		for(String wh:allhandle)
		{
			System.out.println(wh);
		}
		
		driver.quit();
	}

}
