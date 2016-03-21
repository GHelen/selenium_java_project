package ua.odessa.ghelen.applicationlogicrun;

import org.openqa.selenium.By;

import ua.odessa.ghelen.applicationlogic.NavigationHelper;

public class NavigationHelperRun extends DriverBasedHelper implements NavigationHelper {

	private String baseUrl;
	public NavigationHelperRun(ApplicationManagerRun manager) {
		super(manager.getDriver());
		this.baseUrl = manager.getBaseUrl();
		
	}

	@Override
	public void openMainPage() {
		driver.get(baseUrl);
	}

	@Override
	public void gotoBasketPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gotoUserProfilePage() {
		pages.everyPage.ensurePageLoaded().clickUserProfilePage();
		
	}

	@Override
	public void gotoUserBuyBookPage() {
		pages.everyPage.ensurePageLoaded().clickBuyBookPage();
		
	}

	@Override
	public void gotoHomePage() {
		pages.everyPage.ensurePageLoaded().clickhomePageLink();
	}

}
