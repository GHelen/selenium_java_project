package ua.odessa.ghelen.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {
	
	private WebDriver driver;
	public EveryPage everyPage;
	public BuyBookPage buyBookPage;
	public LoginPage loginPage;
	public BasketPage basketPage;
	public UserProfilePage userProfilePage;
	
	public PageManager(WebDriver driver) {
		this.driver = driver;
		this.everyPage = initElements(new EveryPage(this));
		this.buyBookPage = initElements(new BuyBookPage(this));
		this.loginPage = initElements(new LoginPage(this));
		this.basketPage = initElements(new BasketPage(this));
		this.userProfilePage = initElements(new UserProfilePage(this));
	}

    public <T extends Page> T initElements(T page) {
    	PageFactory.initElements(driver, page);
    	return page;
	}

	public WebDriver getWebDriver() {
		return driver;
	}
	
	
	
	

}
