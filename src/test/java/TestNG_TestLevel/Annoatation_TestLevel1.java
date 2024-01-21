package TestNG_TestLevel;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annoatation_TestLevel1 {
//  
//  @BeforeTest
//  void n() {
//	  System.out.println("this is natural");
//  }
	
	
  @Test(priority=1)
  public void xyz() {
	  System.out.println("this is xyz");
  }
  
  @Test(priority=2)
  public void csk() {
	  System.out.println("this is csk");
  }
  
  
  @AfterTest
  void h() {
	  System.out.println("this is harry");
  }
}
