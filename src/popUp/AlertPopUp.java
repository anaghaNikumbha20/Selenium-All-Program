package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/html%20elements/popup.html");
		WebElement button = driver.findElement(By.xpath("//button[.='Click Me!']"));
		button.click();
		Alert a1 = driver.switchTo().alert(); //switch your control
		Thread.sleep(2000);
		//a1.accept(); //accept the alert popup
	   // a1.dismiss();
	   String textOfAlert = a1.getText();
	    System.out.println(textOfAlert);
	}

}
