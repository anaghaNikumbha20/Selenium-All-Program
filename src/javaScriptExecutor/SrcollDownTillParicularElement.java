package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrcollDownTillParicularElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");

		WebElement rubyElement=driver.findElement(By.xpath("//p[.='Ruby']"));
		Point loc=rubyElement.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		System.out.println(xaxis);
		System.out.println(yaxis);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
	}

}
