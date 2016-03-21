/**
 * 
 */
package ua.odessa.ghelen.applicationlogicrun;

/**
 * @author G_user
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import ua.odessa.ghelen.pages.PageManager;

public class DriverBasedHelper {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected PageManager pages;

	  public DriverBasedHelper(WebDriver driver) {
	    this.driver = driver;
	    wait = new WebDriverWait(driver, 30);
	    pages = new PageManager(driver);
	  }
}
