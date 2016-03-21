/**
 * 
 */
package ua.odessa.ghelen.applicationlogicrun;

import org.openqa.selenium.By;

import ua.odessa.ghelen.applicationlogic.UserHelper;
import ua.odessa.ghelen.model.User;

/**
 * @author G_user
 *
 */
public class UserHelperRun extends DriverBasedHelper implements UserHelper {

private ApplicationManagerRun manager;
	
	public UserHelperRun(ApplicationManagerRun manager) {
		super(manager.getDriver());
		this.manager=manager;
	}
	
	@Override
	public void loginAs(User user) {
        pages.everyPage.clickLoginLink().setLoginField(user.getLogin())
	    .setPasswordField(user.getPassword())
	    .clickSubmitButton();

	}

	@Override
	public void logout() {
		pages.everyPage.clickLogoutLink().clickLogoutLink();
	}

	@Override
	public boolean isLoggedIn(){
		return driver.findElements(By.id("logOut")).size() > 0;
	}

	@Override
	public boolean isLoggedInAs(User user) {
		return isLoggedIn()
				&& driver.findElement(By.id("account")).getText().endsWith("helen g");
	}

	@Override
	public boolean isNotLoggedIn() {
		return driver.findElements(By.id("login")).size() > 0;
	}
	
	private User getLoggedUser() {
	    manager.getNavigationHelper().gotoUserProfilePage();
	    return new User()
	      .setFirstName(driver.findElement(By.id("FirstName")).getAttribute("value"))
	      .setLastName(driver.findElement(By.id("LastName")).getAttribute("value"))
	      .setEmail(driver.findElement(By.id("Email")).getAttribute("value"))
	      .setLogin(driver.findElement(By.id("Email")).getAttribute("value"));
	}
}
