package keyWordDriverFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BestTest implements IAutoConstant {
	
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();

		String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
		String url = flib.readPropertyData(PROP_PATH,"Url");


		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}


		else if(browserValue.equals("edge"))
		{
			System.setProperty(EDGE_KEY,EDGE_VALUE);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		else
		{
			System.out.println("enter the valid browserValue!!!");
		}

	}
	public void closeBrowser()
	{
		driver.quit();
	}

}

