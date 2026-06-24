package withTestng;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.EmployeePage;
import pages.HomePage;
import pages.LoginPage;
import pages.UrlClass;
import utilities.EmployeeData;
import utilities.RandomNumber;
import utilities.WebdriverUtility;

public class InsertEmployee {
	
	WebDriver driver;
	@Test
	public void insertEmployee() throws Throwable {
		UrlClass urlc = new UrlClass();
		driver = urlc.url();
		LoginPage loginPage = new LoginPage(driver);
		WebdriverUtility webdriverUtility = new WebdriverUtility(driver);
		loginPage.getUserName().sendKeys("su");
		loginPage.getPassWord().sendKeys("123456");;
		WebElement locationDropDown=loginPage.getUserLocation();
		webdriverUtility.mouseOverAction(locationDropDown);
		webdriverUtility.selectByVisibleText(locationDropDown, "Dr. Tayades Pathlab Diagnostics Center");
		loginPage.getLoginButton().click();
		HomePage homePage  = new HomePage(driver);
		WebElement searchPage=homePage.getSearchDocument();
		searchPage.sendKeys("Employee"+Keys.DOWN);
		Thread.sleep(3000);
		webdriverUtility.mouseOverAction(searchPage);
		String parentWnin = driver.getWindowHandle();
		homePage.getNewTabbutton().click();
		EmployeePage employeePage = new EmployeePage(driver);
		Thread.sleep(3000);
		String window2 = null;
		for(String handle:driver.getWindowHandles()) {
			if(!handle.equals(parentWnin)) {
				window2 = handle;
				driver.switchTo().window(window2);
				break;
			}
		}
		RandomNumber rn = new RandomNumber();
		
//		WebElement typeDropDown=employeePage.getTypeDropdown();
//		webdriverUtility.selectByVisibleText(typeDropDown, "Permanent");
//		employeePage.getEmployeeCheckbox().click();
//		employeePage.getEmpFirstName().sendKeys("Rahul");
//		employeePage.getEmpLastName().sendKeys("Chahar");
//		WebElement empGender=employeePage.getEmpGender();
//		webdriverUtility.selectByVisibleText(empGender, "Male");
//		employeePage.getMobileNumber().sendKeys(""+rn.randomNumber());
		EmployeeData employeeData = new EmployeeData();
		
		Workbook wb = employeeData.getWorkbook("./EmployeeData.xlsx");
		Sheet sheet=wb.getSheet("Sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			employeePage.getAddNew().click();
			Row row = sheet.getRow(i);
			String empType = row.getCell(0).getStringCellValue();
			WebElement typeDropdown=employeePage.getTypeDropdown();
			System.out.println("EmpType from Excel: [" + empType + "]");
			webdriverUtility.selectByVisibleText(typeDropdown, ""+empType);
			employeePage.getEmployeeCheckbox().click();
			String firstName =row.getCell(1).getStringCellValue();
			employeePage.getEmpFirstName().sendKeys(""+firstName);
			String lastName = row.getCell(2).getStringCellValue();
			employeePage.getEmpLastName().sendKeys(""+lastName);
			String gender = row.getCell(3).getStringCellValue();
			employeePage.getEmpGender().sendKeys(""+gender);
			String mobileNomber = String.valueOf((long) row.getCell(4).getNumericCellValue());
			//String mobileNumber = row.getCell(4).getStringCellValue();
			employeePage.getMobileNumber().sendKeys(""+mobileNomber);
			employeePage.getSaveButton().click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			al.accept();
			
			
		}
		
		
		
	}

}
