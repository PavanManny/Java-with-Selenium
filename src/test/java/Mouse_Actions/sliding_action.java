package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sliding_action {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		
		WebElement min_slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("current location of slider element :" + min_slider.getLocation());
		
		WebElement max_slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_slider, 0, 0).perform();
		System.out.println( "location of min_slider element after moving :" + min_slider.getLocation());
		
	}

}
