package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("file:///C:/Users/Admin/Desktop/html%20elements/My%20Page.html");
         String SourceCode =driver.getPageSource();
         Thread.sleep(20000);
         System.out.println(SourceCode);
	}
}
