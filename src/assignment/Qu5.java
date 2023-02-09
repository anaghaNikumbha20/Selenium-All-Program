package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getTitle();
		Set<String> allHandle = driver.getWindowHandles();
		{
			for(String wh:allHandle)
			{
				String currentTitle = driver.switchTo().window(wh).getTitle();
				System.out.println(currentTitle);
				
				if(!parentTitle.endsWith(currentTitle))
				{
					driver.manage().window().maximize();
				}
				else
				{
					driver.quit();
				}
			}
		}
	}

}
