package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleCollectionPage {
	WebDriver driver;

	public SampleCollectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$txtBill")
	private WebElement vidSearch;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_gvServices_ctl01_headcheck")
	private WebElement allcheckBox;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$pageHeader$imgbtnSave")
	private WebElement saveButton;
	
	@FindBy(id = "syesbutton")
	private WebElement yesButton;

	public WebElement getVidSearch() {
		return vidSearch;
	}

	public void setVidSearch(WebElement vidSearch) {
		this.vidSearch = vidSearch;
	}

	public WebElement getAllcheckBox() {
		return allcheckBox;
	}

	public void setAllcheckBox(WebElement allcheckBox) {
		this.allcheckBox = allcheckBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public void setYesButton(WebElement yesButton) {
		this.yesButton = yesButton;
	}
	
	
	

}
