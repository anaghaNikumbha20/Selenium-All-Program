package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void sumo() {
	  Reporter.log("this is sumo class method",true);
  }
  @Test
  public void sumo1() {
	  Reporter.log("this is sumo1 class method ",true);
  }
  @Test
  public void sumo2() {
	  Reporter.log("this is sumo2 class method ",true);
  }
}
