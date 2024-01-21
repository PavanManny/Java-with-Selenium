package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations_ClassLevel {
	@BeforeClass
	  public void login() {
		  System.out.println("login");
	  }
	  
	  @Test(priority=1)
	  void search() {
		  System.out.println("search");
	  }
	  
	  @Test(priority=2)
	  void Advancedsearch() {
		  System.out.println("Advancedsearch");
	  }
	  
	  @AfterClass
	  void logout() {
		  System.out.println("logout");
	  }
}
