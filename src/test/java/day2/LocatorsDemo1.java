package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//open app
		driver.get("http://automationpractice.pl/index.php"); 
		driver.manage().window().maximize();
		
		//find element
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		//click submit
		driver.findElement(By.name("submit_search")).click();
		
		Thread.sleep(3000);
		
		

	}

}
