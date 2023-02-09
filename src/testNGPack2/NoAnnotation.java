package testNGPack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
  @Test
  public void test() {
	  
	  Reporter.log("@Test Annotation",true);
  }
  
  @Test
  public void test2() {
	  
	  Reporter.log("@Test2 Annotation",true);
  }
  
  @BeforeSuite
  public void beforesuit()
  {
	  Reporter.log("@beforesuit Annotation",true);
  }
  
  @AfterSuite
  public void afteresuit()
  {
	  Reporter.log("@beforesuit Annotation",true);
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("@beforeclass Annotation",true);
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("@beforemethod Annotation",true);
  }
  
  @BeforeTest
  public void beforetest()
  {
	  Reporter.log("@beforesuit Annotation",true);
  }
  
  @AfterTest
  public void aftertest()
  {
	  Reporter.log("@beforesuit Annotation",true);
  }
  
  @AfterMethod
  public void aftermethodt()
  {
	  Reporter.log("@beforesuit Annotation",true);
  }
  
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("@beforesuit Annotation",true);
  }
  
}
