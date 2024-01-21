package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Methodlevel {
  
  @BeforeMethod
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
  
  @AfterMethod
  void logout() {
	  System.out.println("logout");
  }
}
