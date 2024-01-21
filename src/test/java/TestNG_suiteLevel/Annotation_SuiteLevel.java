package TestNG_suiteLevel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_SuiteLevel {
	@BeforeTest
	  void m() {
		  System.out.println("This is Manny");
	  }
		
		
		
	  @Test(priority=1)
	  public void abc() {
		  System.out.println("THIS IS ABC");
	  }
	  
	  @BeforeSuite
	  void g() {
		  System.out.println("this is game");
	  }
	  
	  @AfterSuite
	  void d() {
		  System.out.println("this is dare");
		  
		  
	  }
}
