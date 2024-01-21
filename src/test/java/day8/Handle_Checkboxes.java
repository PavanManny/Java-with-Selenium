package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Checkboxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		// select specific checkbox
		//driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		
		List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes :" + checkboxes.size());
		
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
//		 for(WebElement checkbox:checkboxes) {
//			 checkbox.click();
//		 }
	}

}
