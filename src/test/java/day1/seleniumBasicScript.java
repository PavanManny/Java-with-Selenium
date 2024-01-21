package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasicScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// 1)open url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// 2) provide username - Admin 
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// 3) provide password - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// 4) click on login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		// 5) checking title of the page 
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		if(act_title.equals(exp_title)) {
			System.out.println("Test is passed");
		}
		
		else {
			System.out.println("Test is failed");
		}
		
		driver.quit();

	}

}
