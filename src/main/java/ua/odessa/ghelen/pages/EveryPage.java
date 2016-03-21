package ua.odessa.ghelen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EveryPage extends Page {

	public EveryPage(PageManager page) {
		super(page);
	}
	
	public EveryPage ensurePageLoaded() {
	    super.ensurePageLoaded();
	   // wait.until(presenceOfElementLocated(By.cssSelector("nav")));
	    return this;
	  }
	@FindBy(id = "login")
	private WebElement loginLink;
	
	@FindBy(id = "logOut")
	private WebElement logoutLink;
	
	@FindBy(id = "shop")
	private WebElement accountLink;
	
	@FindBy(xpath = "ul[@class='top-menu']/li[1]/a")
	private WebElement homePageLink;
	
	@FindBy(xpath = "ul[@class='top-menu']/li[2]/a")
	private WebElement booksPageLink;
	
	@FindBy(xpath = "ul[@class='top-menu']/li[3]/a")
	private WebElement audioBooksPageLink;
	
	public LoginPage clickLoginLink() {
		 loginLink.click();
		 return pages.loginPage;
	}

	public EveryPage clickLogoutLink() {
		 logoutLink.click();
		 homePageLink.click();
		 return pages.everyPage;
	}
	
	public EveryPage clickhomePageLink() {
		 homePageLink.click();
		 return pages.everyPage;
	}

	public BuyBookPage clickBuyBookPage() {
		booksPageLink.click();
		return pages.buyBookPage;
		
	}

	public void clickUserProfilePage() {
		// TODO Auto-generated method stub
		
	}
	
}
