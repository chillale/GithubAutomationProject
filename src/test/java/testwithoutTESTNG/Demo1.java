package testwithoutTESTNG;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://slims.medivisiondiagnostics.in/uat_MEDIVISION_BILLING/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUserName")).sendKeys("su");
		driver.findElement(By.name("txtPassword")).sendKeys("a" + Keys.TAB);
//       WebElement userLocation=driver.findElement(By.name("ddlUserLocs"));
//        Select s =new Select(userLocation);
//        s.selectByValue("Medivision-")
		driver.findElement(By.name("imgBtnLogin")).click();
		driver.findElement(By.id("Text1")).sendKeys("Customer Visit Registration" + Keys.DOWN + "" + Keys.ENTER);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtmobileno")).sendKeys("6251458698");
		WebElement title = driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlTitle"));
		Select s = new Select(title);
		s.selectByVisibleText("Mr");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFirstName")).sendKeys("vijay");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtYear")).sendKeys("22");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtServiceCode_Auto"))
				.sendKeys("VDC1118" + Keys.DOWN + "" + Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtServiceCode_Auto"))
				.sendKeys("VDC1119" + Keys.DOWN + "" + Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtServiceCode_Auto"))
				.sendKeys("VDC1120" + Keys.DOWN + "" + Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkOverAllConc"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		element.click();
		WebElement concePer = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtConcPerc"));
		concePer.clear();
		concePer.sendKeys("100" + Keys.TAB);
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$UCHeaderControl$imgbtnSave")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		while (true) {
			try {
				Alert alert = wait.until(ExpectedConditions.alertIsPresent());
				System.out.println(alert.getText());
				alert.accept();
			} catch (TimeoutException e) {
				break; // no more alerts
			}
		}
		driver.close();
	}

}
