package testwithoutTESTNG;

import java.awt.Desktop.Action;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerVisitPage {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
		prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
		prefs.put("profile.default_content_setting_values.geolocation", 1);
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);

		options.addArguments("--use-fake-ui-for-media-stream");
		options.addArguments("--use-fake-device-for-media-stream");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tayades.softmed.in/uat_billing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUserName")).sendKeys("su");
		driver.findElement(By.name("txtPassword")).sendKeys("a");
		WebElement locdropdown = driver.findElement(By.name("ddlUserLocs"));
		Actions act = new Actions(driver);
		act.moveToElement(locdropdown).click().perform();
		Select s = new Select(locdropdown);
		s.selectByVisibleText("Dr. Tayades Pathlab Diagnostics Center");
		driver.findElement(By.name("imgBtnLogin")).click();
		WebElement searchdocument = driver.findElement(By.id("Text1"));
		driver.findElement(By.id("Text1")).sendKeys("Customer Visit Registration" + Keys.DOWN);
		Actions act1 = new Actions(driver);
		act1.moveToElement(searchdocument).click().perform();

		String window1 = driver.getWindowHandle();
		System.out.println("Window 1 (Main): " + window1);

		driver.findElement(By.xpath("//i[@class='newtab stpl-stack']")).click();
		Thread.sleep(3000);
		String window2 = null;
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(window1)) {
				window2 = handle;
				driver.switchTo().window(window2);
				System.out.println("Switched to Window 2");
				break;
			}
		}
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtmobileno")).sendKeys("88964489548");
		WebElement title = driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlTitle"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(title).click().perform();
		Thread.sleep(1000);
		Select s1 = new Select(title);
		s1.selectByVisibleText("Mr");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFirstName")).sendKeys("tarun");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtYear")).sendKeys("33");

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtServiceCode_Auto"))
				.sendKeys("TYD93" + Keys.DOWN + "" + Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtServiceCode_Auto"))
				.sendKeys("TYD27" + Keys.DOWN + "" + Keys.ENTER);
		Thread.sleep(1000);
		

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$lblphlebo")).click();

		Thread.sleep(3000);
		WebElement phlebo = driver.findElement(By.id("txt_DivPhleboData_EMP_NAME"));
		act1.moveToElement(phlebo).click().pause(Duration.ofMillis(500)).sendKeys("PRIYANKA" + Keys.ENTER).perform();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//xpath[@class='icon-search']")).click();
		driver.findElement(By.xpath("//table[@id='tbl_DivPhleboData']//tbody//tr[1]")).click();
		Thread.sleep(1000);
		WebElement discoutField = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkOverAllConc"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", discoutField);
		discoutField.click();
		Thread.sleep(1000);
		WebElement concession = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtConcPerc"));
        concession.click();
		concession.clear();
		concession.sendKeys("100" + Keys.TAB);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCHeaderControl_imgbtnSave")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
        Thread.sleep(1000);
		
		al.accept();

	}

}
