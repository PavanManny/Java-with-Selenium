package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click_action {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement f1 = driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		f1.clear();
		f1.sendKeys("Welcome");
		
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
		WebElement f2 = driver.findElement(By.xpath("//*[@id=\"field2\"]"));
		
		String copied_text = f2.getAttribute("value");
		
		System.out.println("copied text is " + copied_text);
		
		// Validation for copied text
		
		if(copied_text.equals("Welcome")) {
			System.out.println("Test is passed");
		}
		
		else {
			System.out.println("Test is failed");
		}
		
		
		

	}

}
