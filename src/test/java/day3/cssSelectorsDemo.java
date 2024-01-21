
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelectorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//cssSelector - tag + id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("realme");
		
		//cssSelector - tag + class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("macbook");
		
		//cssSelector - tag + attribute
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("moto G");
		
		//cssSelector - tag + class + attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("one plus");
	

	}

}
