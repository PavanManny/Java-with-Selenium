package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditional_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access these methods through web elements
		// isDisplayed || isEnabled || isSelected
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		//isDisplayed
		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		System.out.println("Display status of logo : " + logo.isDisplayed());
		
		boolean status = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		System.out.println("Display status of logo : " + status );
		
		//isEnabled
		WebElement Input_Box = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		System.out.println("Enable status of InputBox :" + Input_Box.isEnabled());
		
		boolean status1 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).isEnabled();
		System.out.println("Enable status of InputBox : " + status1 );
		
		//isSelected
		WebElement male_rb = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female_rb = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		System.out.println("Before selected male-status : " + male_rb.isSelected() );
		System.out.println("Before selected female-status : " + female_rb.isSelected() );

		//After click on male radio button
		male_rb.click();
		System.out.println("After selected male-status : " + male_rb.isSelected() );
		System.out.println("After selected female-status : " + female_rb.isSelected() );

		female_rb.click();
		System.out.println("After selected male-status : " + male_rb.isSelected() );
		System.out.println("After selected female-status : " + female_rb.isSelected() );



	}

}
