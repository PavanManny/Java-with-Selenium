package TestNG_TestLevel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_TestLevel {
  
  @BeforeTest
  void m() {
	  System.out.println("This is Manny");
  }
	
	
	
  @Test(priority=1)
  public void abc() {
	  System.out.println("THIS IS ABC");
  }
}
