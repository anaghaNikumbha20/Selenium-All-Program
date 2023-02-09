package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	 // System.out.println("This is method of demo class!!");
	  Reporter.log("This is method of demo method!!!",true);
  }
  @Test
  public void demo1()
  {
	  Reporter.log("This is method of demo1 method!!!",true);
  }
  @Test
  public void demo2()
  {
	int a=45;
	int b=0;
	int res=a/b;
	Reporter.log("This is demo2 method!!!",true);
  }
  
}
