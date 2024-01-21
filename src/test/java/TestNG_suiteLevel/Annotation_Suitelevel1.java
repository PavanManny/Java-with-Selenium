package TestNG_suiteLevel;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotation_Suitelevel1 {
  
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
