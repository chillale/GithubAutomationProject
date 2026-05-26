package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver; 
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Text1")
	private WebElement searchDocument;
	
	@FindBy(xpath = "//i[@class='newtab stpl-stack']")
	private WebElement newTabbutton;
	
	@FindBy(xpath = "//li[@class='list-box user-admin'] ")
	private WebElement logoutSearch;
	
	@FindBy(id = "ctl00_lnkLogout")
	private WebElement logoutLink;

	public WebElement getSearchDocument() {
		return searchDocument;
	}

	public void setSearchDocument(WebElement searchDocument) {
		this.searchDocument = searchDocument;
	}

	public WebElement getNewTabbutton() {
		return newTabbutton;
	}

	public void setNewTabbutton(WebElement newTabbutton) {
		this.newTabbutton = newTabbutton;
	}

	public WebElement getLogoutSearch() {
		return logoutSearch;
	}

	public void setLogoutSearch(WebElement logoutSearch) {
		this.logoutSearch = logoutSearch;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	
	
	

}
