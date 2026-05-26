package withTestng;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CustomerPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UrlClass;
import testwithoutTESTNG.CustomerVisitPage;
import utilities.Dbconnection;
import utilities.RandomNumber;

public class CustomerVisitTest {

	WebDriver driver;

	@Test
	public void customerVisit() throws Throwable {
		UrlClass urlcl = new UrlClass();
		driver = urlcl.url();
		LoginPage loginPage = new LoginPage(driver);
		utilities.WebdriverUtility webDriverUtility = new utilities.WebdriverUtility(driver);
		loginPage.getUserName().sendKeys("su");
		loginPage.getPassWord().sendKeys("a");
		WebElement locationDropdown = loginPage.getUserLocation();
		webDriverUtility.mouseOverAction(locationDropdown);
		webDriverUtility.selectByVisibleText(locationDropdown, "Dr. Tayades Pathlab Diagnostics Center");
		loginPage.getLoginButton().click();
		HomePage homePage = new HomePage(driver);
		WebElement searchDocument = homePage.getSearchDocument();
		searchDocument.sendKeys("Customer Visit Registration" + Keys.DOWN);
		Thread.sleep(3000);

		webDriverUtility.mouseOverAction(searchDocument);
		System.out.println(driver.getTitle());
		String parentWin = driver.getWindowHandle();
		homePage.getNewTabbutton().click();
		CustomerPage customervisitPage = new CustomerPage(driver);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		String window2 = null;
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(parentWin)) {
				window2 = handle;
				driver.switchTo().window(window2);
				System.out.println("Switched to Window 2");
				break;
			}
		}

		RandomNumber rn = new RandomNumber();
		System.out.println(rn.randomNumber());
		customervisitPage.getMobileNo().sendKeys("" + rn.randomNumber());
		WebElement titledr = customervisitPage.getTitleDropdown();
		webDriverUtility.selectByVisibleText(titledr, "Mr");
		Faker f = new Faker();
		String firstName = f.name().firstName();
		customervisitPage.getFirstName().sendKeys(firstName);
		WebElement age = customervisitPage.getAge();

		age.sendKeys("" + rn.age());
		Dbconnection con = new Dbconnection();
		List<String> service_cd = con.getStringvalue();

		for (int i = 0; i <= 5; i++) {

			if (i >= service_cd.size()) {

				System.out.println("No more codes available");
			}
			String singlecode = service_cd.get(i);
			customervisitPage.getServicecode().sendKeys(singlecode + "" + Keys.DOWN + "" + Keys.ENTER);
			Thread.sleep(1000);
		}

		customervisitPage.getPhleboButton().click();
		WebElement phlebosearch = customervisitPage.getSearchPhlebo();
		phlebosearch.sendKeys("priyanka" + Keys.ENTER);
		webDriverUtility.mouseOverAction(phlebosearch);
		customervisitPage.getPhleboClick().click();
		Thread.sleep(2000);
		WebElement dueAuthorizedButton = customervisitPage.getDueAuthorizeButton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dueAuthorizedButton);
		dueAuthorizedButton.click();
		customervisitPage.getDueAuthorizeby().click();
		customervisitPage.getRemarksField().sendKeys("d");

		customervisitPage.getSaveButton().click();
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		Alert al2 = driver.switchTo().alert();
		String billNumber = driver.switchTo().alert().getText();
		System.out.println(billNumber);
		StringBuilder digits = new StringBuilder();
		for(char c : billNumber.toCharArray()) {
			if(Character.isDigit(c)) {
				digits.append(c);
			}
			
		}
		al2.accept();
		System.out.println(digits);
	}

}
