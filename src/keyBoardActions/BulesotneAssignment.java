package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BulesotneAssignment {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("confirmBtn")).click();
	WebElement target=driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(target).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Band']")).click();
	WebElement clickAndHold = driver.findElement(By.xpath("//div[.='Filter by']"));
	
	for(int i=0;i<=2;i++)
	{
		act.clickAndHold(clickAndHold);
	}
	Robot robot=new Robot();

	
	robot.keyPress(KeyEvent.VK_CONTROL);
	
	driver.findElement(By.xpath("//input[@class='form-text typeahead xdsoft_input']"));
	driver.findElement(By.xpath("//input[@name='submit_search']")).click();

}
}
