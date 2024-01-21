package DependsOnMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	
	
  @Test(priority=1)
  public void openapp() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=2,dependsOnMethods= {"openapp"})
  public void login() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=3,dependsOnMethods= {"login"})
  void search() {
	  Assert.assertTrue(false);
  }
  
  @Test(priority=4,dependsOnMethods= {"login","search"})
  void Advancedsearch() {
	  Assert.assertTrue(false);
  }
  
  @Test(priority=5,dependsOnMethods= {"login"})
  void logout() {
	  Assert.assertTrue(true);
  }
}
