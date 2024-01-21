package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click_action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Eclipse Artifacts\\selenium.com\\Driver\\chromedriver.exe");
		ChromeOptions chrOpt = new ChromeOptions();
		chrOpt.setBinary("C:\\Users\\pavan\\ChromeBrowserForTesting-Selenium\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(chrOpt);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();       // click on copy element
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();   // close alert window
		
		

	}

}
