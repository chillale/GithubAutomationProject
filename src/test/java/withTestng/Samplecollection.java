package withTestng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SampleCollectionPage;
import pages.UrlClass;
import utilities.WebdriverUtility;

public class Samplecollection {
	WebDriver driver;

	@Test
	public void sampleCollection() throws InterruptedException {
		UrlClass url = new UrlClass();
		driver = url.url();
		LoginPage loginPage = new LoginPage(driver);
		WebdriverUtility webDriverUtility = new WebdriverUtility(driver);
		loginPage.getUserName().sendKeys("su");
		loginPage.getPassWord().sendKeys("a");
		WebElement locationDropDown = loginPage.getUserLocation();
		webDriverUtility.mouseOverAction(locationDropDown);
		webDriverUtility.selectByVisibleText(locationDropDown, "Dr. Tayades Pathlab Diagnostics Center");
		loginPage.getLoginButton().click();
		Thread.sleep(2000);
		HomePage homePage = new HomePage(driver);
		WebElement searchDocument = homePage.getSearchDocument();
		searchDocument.sendKeys("Sample Collection" + Keys.DOWN);
		Thread.sleep(2000);
		webDriverUtility.mouseOverAction(searchDocument);
		System.out.println(driver.getTitle());
		String parentWin = driver.getWindowHandle();
		homePage.getNewTabbutton().click();
		CustomerVisitTest customerVisitTest = new CustomerVisitTest();
		SampleCollectionPage sampleCollection = new SampleCollectionPage(driver);
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

		sampleCollection.getVidSearch().sendKeys("1026006256" + Keys.ENTER);
		sampleCollection.getAllcheckBox().click();
		sampleCollection.getSaveButton().click();
		sampleCollection.getYesButton().click();

	}

}
