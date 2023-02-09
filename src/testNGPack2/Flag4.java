package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logInMethod() {
	  Reporter.log("Log is Done!!!",true);	  
  }
  @Test(dependsOnMethods = "logInMethod")
  public void CreateUser()
  {
	  Reporter.log("User is created!!",true);
  }
  @Test(dependsOnMethods = "CreateUser")
  public void LogOutMethod()
  {
	  Reporter.log("Log out Done!!!",true);
  }
}
