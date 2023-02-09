package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrapElemnet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/html%20elements/demo3.html");
		 WebElement drpDownElement = driver.findElement(By.id("menu"));
		 Select sel = new Select(drpDownElement);
		String options = sel.getWrappedElement().getText();
		System.out.println(options);
	}

}
