package ua.odessa.ghelen.applicationlogicrun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import ua.odessa.ghelen.applicationlogic.ApplicationManager;
import ua.odessa.ghelen.applicationlogic.NavigationHelper;
import ua.odessa.ghelen.applicationlogic.UserHelper;
import ua.odessa.ghelen.util.Browser;
import ua.odessa.ghelen.util.PropertyLoader;
import ua.odessa.ghelen.webdriver.WebDriverFactory;

public class ApplicationManagerRun implements ApplicationManager {

	  private UserHelper userHelper;
	  private NavigationHelper navigationHelper;
	  private WebDriver driver;
	  private String baseUrl;
	  
public ApplicationManagerRun() {
		  
	baseUrl = PropertyLoader.loadProperty("site.url");
  String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

  Browser browser = new Browser();
  browser.setName(PropertyLoader.loadProperty("browser.name"));
  browser.setVersion(PropertyLoader.loadProperty("browser.version"));
  browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

  String username = PropertyLoader.loadProperty("user.username");
  String password = PropertyLoader.loadProperty("user.password");
  
  driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		userHelper = new UserHelperRun(this);
		navigationHelper = new NavigationHelperRun(this);
		getNavigationHelper().openMainPage();
}
		@Override
		public UserHelper getUser() {
			return userHelper;
		}

		public NavigationHelper getNavigationHelper() {
			return navigationHelper;
		}
		public WebDriver getDriver() {
			return driver;
		}
		public String getBaseUrl() {
			return baseUrl;
		}
		
		@Override
		public void stop() {
			if (driver != null) {
				driver.quit();
			}
		}
		

	}


