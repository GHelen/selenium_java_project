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

public class DriverBasedHelper {

	protected WebDriver driver;
	  protected WebDriverWait wait;

	  public DriverBasedHelper(WebDriver driver) {
	    this.driver = driver;
	    wait = new WebDriverWait(driver, 30);
	  }
}
