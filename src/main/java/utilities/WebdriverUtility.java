package utilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.time.Duration;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebdriverUtility {
	WebDriver driver;

	public WebdriverUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void timeOut() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120)); // ✅ increase
		    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(120));
	}

	public void selectByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}

	public void selectByIndex(WebElement ele, int value) {
		Select select = new Select(ele);
		select.selectByIndex(value);
	}


		
	
		public void mouseOverAction(WebElement ele) {
			Actions act= new Actions(driver);
			act.moveToElement(ele).click().perform();
			
		}

	
}
