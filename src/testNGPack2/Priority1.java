package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
  @Test
  public void m1() {
	  Reporter.log("m1",true);
  }
  
  @Test(priority = 1)
  public void d1() {
	  Reporter.log("d1",true);
  }
  
  @Test
  public void e1() {
	  Reporter.log("e1",true);
  }
  
  @Test(priority = 1)
  public void g1() {
	  Reporter.log("g1",true);
  }
  
  @Test(priority = 0)
  public void j1() {
	  Reporter.log("j1",true);
  }
  
  @Test(priority = -3)
  public void r1() {
	  Reporter.log("r1",true);
  }
}
