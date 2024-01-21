package TestNG_All_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_AllLevels {
  
	
	  @BeforeSuite
	  void g() {
		  System.out.println("this is before suite");
	  }
	  
	  @AfterSuite
	  void d() {
		  System.out.println("this is after suite");
		  
		  
	  }
	  
	  @BeforeTest
	  void m() {
		  System.out.println("This is before test");
	  }
		
	  
	  @AfterTest
	  void h() {
		  System.out.println("this is after test");
	  }
	  
	  
	  @BeforeClass
	  public void login() {
		  System.out.println("this is before class");
	  }
	  
	  
	  @AfterClass
	  void logout() {
		  System.out.println("this is after class");
	  }
	  
	  @BeforeMethod
	  public void login1() {
		  System.out.println("this is before method");
	  }
	  
	  @AfterMethod
	  void logout1() {
		  System.out.println("this is after method");
	  }
	  
	  
	  @Test(priority=1)
	  void search() {
		  System.out.println("search");
	  }
	  
	  
	  @Test(priority=2)
	  void Advancedsearch() {
		  System.out.println("Advancedsearch");
	  }
	  
	  
	  
	  
}
