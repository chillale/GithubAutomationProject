package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	WebDriver driver;
	
	public EmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlEmpType")
	private WebElement typeDropdown;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtEmpFirstName")
	private WebElement empFirstName;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtEmpLastName")
	private WebElement empLastName;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkEmpcd")
	private WebElement employeeCheckbox;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtmobileno")
	private WebElement mobileNumber;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$ucPageHeader$imgbtnSave")
	private WebElement saveButton;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$headerControl1$imgadd")
	private WebElement addNew;

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlEmpGender")
	private WebElement empGender;
	
	

	public WebElement getEmpGender() {
		return empGender;
	}

	public void setEmpGender(WebElement empGender) {
		this.empGender = empGender;
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public void setAddNew(WebElement addNew) {
		this.addNew = addNew;
	}

	public WebElement getTypeDropdown() {
		return typeDropdown;
	}

	public void setTypeDropdown(WebElement typeDropdown) {
		this.typeDropdown = typeDropdown;
	}

	public WebElement getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(WebElement empFirstName) {
		this.empFirstName = empFirstName;
	}

	public WebElement getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(WebElement empLastName) {
		this.empLastName = empLastName;
	}

	public WebElement getEmployeeCheckbox() {
		return employeeCheckbox;
	}

	public void setEmployeeCheckbox(WebElement employeeCheckbox) {
		this.employeeCheckbox = employeeCheckbox;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(WebElement mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}
	
	

}
