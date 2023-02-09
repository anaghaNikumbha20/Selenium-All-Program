package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do;jsessionid=2l3fk7lk7u8qn");
		WebElement UsernameTextBoz=driver.findElement(By.name("username"));
		UsernameTextBoz.sendKeys("admin");
		WebElement PasswordTextBox=driver.findElement(By.name("pwd"));
		PasswordTextBox.sendKeys("manager");
		Thread.sleep(2000);
		UsernameTextBoz.clear();
		PasswordTextBox.clear();
	}

}
