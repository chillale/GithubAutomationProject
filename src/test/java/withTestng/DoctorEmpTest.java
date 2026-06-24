package withTestng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.DoctorEmployee;
import pages.UrlClass;
import utilities.WebdriverUtility;

public class DoctorEmpTest {
	WebDriver driver;
	@Test
	public void doctorEmp() throws InterruptedException {
		UrlClass urlcl = new UrlClass();
		WebdriverUtility webDriverUtility = new WebdriverUtility(driver);
		driver=urlcl.url();
		DoctorEmployee doctorEmployee = new DoctorEmployee(driver);
		doctorEmployee.getUserName().sendKeys("mvr");
		doctorEmployee.getPassWord().sendKeys("S$1234");
		doctorEmployee.getLoginButton().click();
		WebElement locationd=doctorEmployee.getUserLocation();
		Select s = new Select(locationd);
		s.selectByIndex(1);
		doctorEmployee.getContinueButton().click();
		doctorEmployee.getNameSearch().sendKeys("Doctor Employee"+Keys.DOWN);
		String parentWin = driver.getWindowHandle();
		doctorEmployee.getNewTab().click();
		org.openqa.selenium.Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		Thread.sleep(2000);
		String window2 = null;
		for(String handle : driver.getWindowHandles()) {
			if(!handle.equals(parentWin)) {
				window2 = handle;
				driver.switchTo().window(window2);
				break;
			}
		}
		((JavascriptExecutor)driver)
	    .executeScript("document.body.style.zoom='70%'");
		Thread.sleep(2000);
		WebElement title=doctorEmployee.getTitleDropdown();
		webDriverUtility.selectByVisibleText(title, "Dr");
		doctorEmployee.getEmpFirstName().sendKeys("rajesh");
		doctorEmployee.getEmpLastName().sendKeys("cha");
		WebElement empType=doctorEmployee.getEmpType();
		webDriverUtility.selectByVisibleText(empType, "Consultant");
		doctorEmployee.getEmpYear().sendKeys("33");
		WebElement empGender=doctorEmployee.getEmpGender();
		webDriverUtility.selectByVisibleText(empGender, "Male");
		doctorEmployee.getEmpCategory().sendKeys("Doctor");
		
		doctorEmployee.getDesignationSearch().sendKeys("2D-Echo");
		doctorEmployee.getDesignationSearch().sendKeys(Keys.DOWN);
		doctorEmployee.getDesignationSearch().sendKeys(Keys.ENTER);
		doctorEmployee.getDepartmentSearch().sendKeys("Accounts"+Keys.DOWN+""+Keys.ENTER);
		Thread.sleep(2000);
		WebElement doctorCheckbox=doctorEmployee.getIsDoctorCheckbox();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", doctorCheckbox);
		WebElement consultantCheckbox=doctorEmployee.getIsConsultationCheckbox();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", consultantCheckbox);
		doctorEmployee.getDoctorCode().clear();
		doctorEmployee.getDoctorCode().sendKeys("s3244");
		doctorEmployee.getDoctorRegNo().sendKeys("12345");
		
		
		
	}

}
