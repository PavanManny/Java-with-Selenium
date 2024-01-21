package day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//getTitle()
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//getCurrentUrl
		String current_URL = driver.getCurrentUrl();
		System.out.println(current_URL);
		
		//getPageSource
		String PageSource = driver.getPageSource();
		System.out.println("PageSource : " + PageSource);
		System.out.println(driver.getPageSource().contains("html"));
		
		//getWindowHandle
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
		
		//getWindowHandles
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windows = driver.getWindowHandles();
		
		for(String window: windows) {
			System.out.println(window);
		}
		////*[@id="logo"]
	}

}
