package synchronaization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchActitime2 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://127.0.0.1/login.do;jsessionid=ksov3vvf2rms");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleContains("Login"));
			String actualLoginPageTitle=driver.getTitle();
			System.out.println(actualLoginPageTitle);
		 System.out.println("Login Page Title Is Matched : Test case is Passed!!");
	}

}
