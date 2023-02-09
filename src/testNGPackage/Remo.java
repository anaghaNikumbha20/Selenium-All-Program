package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void remo() {
	  Reporter.log("this is remo class method ",true);
  }
  @Test
  public void remo1() {
	  Reporter.log("this is remo1 class method ",true);
  }
  @Test
  public void remo2() {
	  Reporter.log("this is remo2 class method ",true);
  }
}
