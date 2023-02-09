package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwivk-mXzu77AhXUqpYKHZXpDfcYABASGgJ0bA&ohost=www.google.com&cid=CAESa-D22WIsNM0hJdZWGFEahOmOzbGsQHCt7ZdfO6tkud4ZK7uPoRwzPObpBaAZOp8lCzLtV762jIk_7ANcb7Mx4V_YLGGZ4PxN37Jlcs4bhqLLPOpIgwyQGF-O_RGbBtuTpPfd6qAiArTfrNkh&sig=AOD64_3LyBet-u_hLn-ADu1SO0SEDbdV9g&q&adurl&ved=2ahUKEwjTpOCXzu77AhVbMXAKHTyeBR8Q0Qx6BAgLEAE");
		Thread.sleep(2000);
		driver.findElement(By.id("cookie-banner-close-btn")).click();
		driver.findElement(By.xpath("//h3[@class='tw-8216tu' and (@title='Softride Pro Coast Training Shoes')]")).click();
	}


}