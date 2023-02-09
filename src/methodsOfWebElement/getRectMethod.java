package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download=driver.findElement(By.xpath("//h1[.='Downloads']"));
		Rectangle rect=download.getRect();
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println("X Axis="+xaxis);
		System.out.println("Y Axis="+yaxis);
		System.out.println("Height="+height);
		System.out.println("Width="+width);
	}

}
