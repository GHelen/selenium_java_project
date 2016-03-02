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
	public void openBasket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gotoUserProfilePage() {
		driver.findElement(By.id("shop")).click();
	    driver.findElement(By.linkText("Personal details")).click();
		
	}

	@Override
	public void gotoUserSeachPage() {
		// TODO Auto-generated method stub
		
	}

}
