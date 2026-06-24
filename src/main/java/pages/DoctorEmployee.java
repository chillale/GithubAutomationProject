package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorEmployee {
	WebDriver driver;
	public DoctorEmployee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "txtUserName")
	private WebElement userName;
	
	@FindBy(name = "loginPassword")
	private WebElement passWord;
	
	@FindBy(name = "imgBtnLogin")
	private WebElement loginButton;
	
	@FindBy(name = "globalSearch")
	private WebElement nameSearch;
	
	@FindBy(name = "ddlUserLocation")
	private WebElement userLocation;
	
	@FindBy(name = "btnUserOk")
	private WebElement continueButton;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement titleDropdown;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtEmpFirstName")
	private WebElement empFirstName;
	
    @FindBy(name = "ctl00$ContentPlaceHolder1$txtEmpLastName")
    private WebElement empLastName;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$newAgeUc$txtYear")
    private WebElement empYear;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlDocSex")
    private WebElement empGender;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$ddldocemptype")
    private WebElement empType;
    
    @FindBy(id = "ctl00_ContentPlaceHolder1_chkDoctorCode")
    private WebElement isDoctorCheckbox;
    
    @FindBy(id = "ctl00_ContentPlaceHolder1_Isconsulation")
    private WebElement isConsultationCheckbox;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$txtDoctorCode")
    private WebElement doctorCode;
    
    @FindBy(name = "lk_btn_ctl00_ContentPlaceHolder1_ucDepartments")
    private WebElement departmentLookup;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$txtDocQualification")
    private WebElement qualification;
    
    @FindBy(id = "lk_btn_ctl00_ContentPlaceHolder1_ucSpeciality")
    private WebElement empspecialization;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$DropDownList1")
    private WebElement empCategory;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$ucDepartments$txtSearchControl")
    private WebElement departmentSearch;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$ucDesignation$txtSearchControl")
    private WebElement designationSearch;
    
    @FindBy(name = "ctl00$ContentPlaceHolder1$txtdocregno")
    private WebElement doctorRegNo;
    
    
    
    
	
	public WebElement getDepartmentSearch() {
		return departmentSearch;
	}

	public void setDepartmentSearch(WebElement departmentSearch) {
		this.departmentSearch = departmentSearch;
	}

	public WebElement getDesignationSearch() {
		return designationSearch;
	}

	public void setDesignationSearch(WebElement designationSearch) {
		this.designationSearch = designationSearch;
	}

	public WebElement getDoctorRegNo() {
		return doctorRegNo;
	}

	public void setDoctorRegNo(WebElement doctorRegNo) {
		this.doctorRegNo = doctorRegNo;
	}

	public WebElement getEmpCategory() {
		return empCategory;
	}

	public void setEmpCategory(WebElement empCategory) {
		this.empCategory = empCategory;
	}

	public WebElement getTitleDropdown() {
		return titleDropdown;
	}

	public void setTitleDropdown(WebElement titleDropdown) {
		this.titleDropdown = titleDropdown;
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

	public WebElement getEmpYear() {
		return empYear;
	}

	public void setEmpYear(WebElement empYear) {
		this.empYear = empYear;
	}

	public WebElement getEmpGender() {
		return empGender;
	}

	public void setEmpGender(WebElement empGender) {
		this.empGender = empGender;
	}

	public WebElement getEmpType() {
		return empType;
	}

	public void setEmpType(WebElement empType) {
		this.empType = empType;
	}

	public WebElement getIsDoctorCheckbox() {
		return isDoctorCheckbox;
	}

	public void setIsDoctorCheckbox(WebElement isDoctorCheckbox) {
		this.isDoctorCheckbox = isDoctorCheckbox;
	}

	public WebElement getIsConsultationCheckbox() {
		return isConsultationCheckbox;
	}

	public void setIsConsultationCheckbox(WebElement isConsultationCheckbox) {
		this.isConsultationCheckbox = isConsultationCheckbox;
	}

	public WebElement getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(WebElement doctorCode) {
		this.doctorCode = doctorCode;
	}

	public WebElement getDepartmentLookup() {
		return departmentLookup;
	}

	public void setDepartmentLookup(WebElement departmentLookup) {
		this.departmentLookup = departmentLookup;
	}

	public WebElement getQualification() {
		return qualification;
	}

	public void setQualification(WebElement qualification) {
		this.qualification = qualification;
	}

	public WebElement getEmpspecialization() {
		return empspecialization;
	}

	public void setEmpspecialization(WebElement empspecialization) {
		this.empspecialization = empspecialization;
	}

	public WebElement getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(WebElement userLocation) {
		this.userLocation = userLocation;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}
	@FindBy(xpath = "//button[@class='ntab newtab']")
	private WebElement newTab;
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getNameSearch() {
		return nameSearch;
	}

	public void setNameSearch(WebElement nameSearch) {
		this.nameSearch = nameSearch;
	}

	public WebElement getNewTab() {
		return newTab;
	}

	public void setNewTab(WebElement newTab) {
		this.newTab = newTab;
	}
	
	

}
