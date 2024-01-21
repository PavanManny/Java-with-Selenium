package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_popups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		//Scenario : 1
		/*alert alertwindow = driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.accept();
		alertwindow.dismiss();*/
		
		//scenario : 2
		Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertwindow.getText());
		
		alertwindow.accept();
		alertwindow.dismiss();
		
		/* If you want directly close the alert window
		   driver.switchTo().alert().accept();  */

	}

}
