package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//to avoid staleRefrenceexception
	
	@FindBy(name="username") private WebElement UsernameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(id="loginButton") private WebElement LoginButtin;
	@FindBy(id="keepLoggedInCheckBox") private WebElement LoggedInCheckBox;
	@FindBy(xpath="//a[.='Actimind Inc.']") private WebElement ActiMindLink;
	@FindBy(id="licenseLink") private WebElement LicenseLink;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUsernameTB() {
		return UsernameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public WebElement getLoginButtin() {
		return LoginButtin;
	}
	public WebElement getLoggedInCheckBox() {
		return LoggedInCheckBox;
	}
	public WebElement getActiMindLink() {
		return ActiMindLink;
	}
	public WebElement getLicenseLink() {
		return LicenseLink;
	}
	
	public void actiTimeValidLogin(String ValidUsername, String ValidPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(ValidUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(ValidPassword);
		Thread.sleep(2000);
		LoginButtin.click();
		
	}
	
	public void actiTimeInvalidLogin(String InvalidUsn, String InvalidPwd) throws InterruptedException
	{
		UsernameTB.sendKeys(InvalidUsn);
		Thread.sleep(2000);
		PasswordTB.sendKeys(InvalidPwd);
		Thread.sleep(2000);
		LoginButtin.click();
	}
	
}
