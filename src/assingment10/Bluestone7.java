package assingment10;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Bluestone7 {
	public static void main(String[] args) throws IOException, InterruptedException    {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.xpath("(//a[@id='pid_5676'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	

		//File src=driver.getScreenshotAs(OutputType.FILE);
		//File dest=new File("./screenShots/Bluestone7.jpg");
		//Files.copy(src, dest);
		//driver.close();
		
		
	}

}
