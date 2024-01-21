package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithInputbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		String msg = alertwindow.getText();
		System.out.println(msg);
		
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
		
		Thread.sleep(3000);
		
		//Validation 
		String act_text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		String exp_text = "You entered: welcome";
		
		if(act_text.equals(exp_text)) {
			System.out.println("test is passed");
		}
		
		else {
			System.out.println("test is failed");
		}

	}

}
