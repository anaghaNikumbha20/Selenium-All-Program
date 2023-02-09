package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
       driver.get("file:///C:/Users/Admin/Desktop/html%20elements/demo3.html");
       WebElement drpDownElement = driver.findElement(By.name("menu"));
       Select sel = new Select(drpDownElement);
       sel.selectByValue("v3");
       Thread.sleep(2000);
       sel.deselectByValue("v3");
       
	}
}
