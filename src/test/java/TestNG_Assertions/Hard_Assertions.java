package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions {
  @Test
  public void test() {
	  
	  /*int a = 2;
	  int b = 4;
	  
	  if(a==b) {
		  System.out.println("test is passed");
	  }
	  else {
		  System.out.println("test is failed");
	  }*/
	  

	  //--------->Scenario : 1
	  
	  /*int x=3;
	  int y=5;
	  
	  //Assert.assertEquals(x,y);
	  //Assert.assertNotEquals(x,y);*/
	  
	 
	  //--------->Scenario : 2
	  
	  /*int x=2;
	  int y=2;
	  
	  Assert.assertEquals(x,y);
	  Assert.assertNotEquals(x,y);*/
	  
	  
	 //--------->Scenario : 3
	  
	  int x=2;
	  int y=2;
	  
	  
	  Assert.assertNotEquals(x,y);
	  Assert.assertTrue(false);
	  
  }
}
