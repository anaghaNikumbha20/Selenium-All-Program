package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("/webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	     
	     FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);
	     Sheet sheet = wb.getSheet("Orange");
	     Row row = sheet.getRow(1);
	     Cell cell = row.getCell(0);
	     String usn = cell.getStringCellValue();
	     
	     
	    FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
	    Workbook wb2 = WorkbookFactory.create(fis2);
	    Sheet sheet1 = wb2.getSheet("Orange");
	    Row row2 = sheet1.getRow(1);
	    Cell cell2 = row2.getCell(0);
	    String pwd = cell2.getStringCellValue();
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//button[.=' Login ']")).click();
	    driver.quit();
	    
	    
	    
	    
	}

}
