package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	WebDriver driver;
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtmobileno")
	private WebElement mobileNo;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement titleDropdown;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtFirstName")
	private WebElement firstName;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtYear")
	private WebElement age;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtServiceCode_Auto")
	private WebElement servicecode;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkOverAllConc")
	private WebElement allconcheckbox;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtConcPerc")
	private WebElement discountField;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$lblphlebo")
	private WebElement phleboButton;
	
	@FindBy(id = "txt_DivPhleboData_EMP_NAME")
	private WebElement searchPhlebo;
	
	@FindBy(xpath = "//table[@id='tbl_DivPhleboData']//tbody//tr[1]")
	private WebElement phleboClick;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$UCHeaderControl$imgbtnSave")
	private WebElement saveButton;
	
	@FindBy(id = "lk_btn_ctl00_ContentPlaceHolder1_UCtransaction_UCdueAuthBy")
	private WebElement dueAuthorizeButton;
	
	@FindBy(xpath = "//table[@class='lk_tbl_body jtblgrid looktbl']/tbody/tr[1]")
	private WebElement dueAuthorizeby;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$UCtransaction$txtDueAmt")
	private WebElement dueAmount;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$UCtransaction$txtCs_Total")
	private WebElement payableAmount;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_UCtransaction_chkPaymentMode_0")
	private WebElement cashAmountcheckbox;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$UCtransaction$txtRemarks")
	private WebElement remarksField;
	
	
	
	
	
	public WebElement getRemarksField() {
		return remarksField;
	}

	public void setRemarksField(WebElement remarksField) {
		this.remarksField = remarksField;
	}

	public WebElement getCashAmountcheckbox() {
		return cashAmountcheckbox;
	}

	public void setCashAmountcheckbox(WebElement cashAmountcheckbox) {
		this.cashAmountcheckbox = cashAmountcheckbox;
	}

	public WebElement getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(WebElement dueAmount) {
		this.dueAmount = dueAmount;
	}

	public WebElement getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(WebElement payableAmount) {
		this.payableAmount = payableAmount;
	}

	public WebElement getDueAuthorizeButton() {
		return dueAuthorizeButton;
	}

	public void setDueAuthorizeButton(WebElement dueAuthorizeButton) {
		this.dueAuthorizeButton = dueAuthorizeButton;
	}

	public WebElement getDueAuthorizeby() {
		return dueAuthorizeby;
	}

	public void setDueAuthorizeby(WebElement dueAuthorizeby) {
		this.dueAuthorizeby = dueAuthorizeby;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(WebElement mobileNo) {
		this.mobileNo = mobileNo;
	}

	public WebElement getTitleDropdown() {
		return titleDropdown;
	}

	public void setTitleDropdown(WebElement titleDropdown) {
		this.titleDropdown = titleDropdown;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getAge() {
		return age;
	}

	public void setAge(WebElement age) {
		this.age = age;
	}

	public WebElement getServicecode() {
		return servicecode;
	}

	public void setServicecode(WebElement servicecode) {
		this.servicecode = servicecode;
	}

	public WebElement getAllconcheckbox() {
		return allconcheckbox;
	}

	public void setAllconcheckbox(WebElement allconcheckbox) {
		this.allconcheckbox = allconcheckbox;
	}

	public WebElement getDiscountField() {
		return discountField;
	}

	public void setDiscountField(WebElement discountField) {
		this.discountField = discountField;
	}

	public WebElement getPhleboButton() {
		return phleboButton;
	}

	public void setPhleboButton(WebElement phleboButton) {
		this.phleboButton = phleboButton;
	}

	public WebElement getSearchPhlebo() {
		return searchPhlebo;
	}

	public void setSearchPhlebo(WebElement searchPhlebo) {
		this.searchPhlebo = searchPhlebo;
	}

	public WebElement getPhleboClick() {
		return phleboClick;
	}

	public void setPhleboClick(WebElement phleboClick) {
		this.phleboClick = phleboClick;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}
	
	
	

}
