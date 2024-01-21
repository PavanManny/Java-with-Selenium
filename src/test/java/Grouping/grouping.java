package Grouping;

import org.testng.annotations.Test;

public class grouping {
  
  @Test(priority=1,groups= {"sanity,regression"})
  public void loginByEmail() {
	  System.out.println("this is login by email ");
  }
  
  @Test(priority=2,groups= {"sanity"})
  public void loginByFacebook() {
	  System.out.println("this is login by facebook ");
  }
  
  @Test(priority=3,groups= {"sanity"})
  public void loginByTwitter() {
	  System.out.println("this is login by twitter ");
  }
  
  @Test(priority=4,groups= {"sanity,regression"})
  public void signupByEmail() {
	  System.out.println("this is signup by email ");
  }
  
  @Test(priority=5,groups= {"regression"})
  public void signupByFacebook() {
	  System.out.println("this is signup by facebook ");
  }
  
  @Test(priority=6,groups= {"regression"})
  public void signupByTwitter() {
	  System.out.println("this is signup by twitter ");
  }
  
  @Test(priority=7,groups= {"sanity,regression"})
  public void paymentInRupees() {
	  System.out.println("this is payment in rupees ");
  }
  
  @Test(priority=8,groups= {"sanity"})
  public void paymentInDollars() {
	  System.out.println("this is payment in dollars ");
  }
  
  @Test(priority=9,groups= {"regression"})
  public void paymentReturnByBank() {
	  System.out.println("this is payment return by bank ");
  }
}
