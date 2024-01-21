package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =  new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@placeholder='Search']"));

	}

}
