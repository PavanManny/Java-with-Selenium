package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_down {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=34");
		driver.manage().window().maximize();
		
		WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select mobile = new Select(mobiles);
		
		// 1) Selecting an option from the dropdown
		
		//selectByValue(""); //selectByIndex(); //selectByVisibleText("");
		//mobile.selectByVisibleText("Price (High > Low)");
		
		// 2) Find total number of elements
		
		 List<WebElement> options = mobile.getOptions();
		 System.out.println(options.size());
		 
		 for(int i=0;i<options.size();i++)
		 {
			 System.out.println(options.get(i).getText());
 
		 }
		 
		 /*for(WebElement option: options) {
			 System.out.println(option.getText());
		 }*/
			 
		 
		

	}

}
