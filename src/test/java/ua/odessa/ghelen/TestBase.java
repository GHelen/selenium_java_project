package ua.odessa.ghelen;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import ua.odessa.ghelen.applicationlogic.ApplicationManager;
import ua.odessa.ghelen.applicationlogiclevel_0.ApplicationManagerLevel_0;
import ua.odessa.ghelen.applicationlogicrun.ApplicationManagerRun;

public class TestBase {

  protected ApplicationManager app;

	@BeforeSuite
	public void init() {
		app = new ApplicationManagerRun();
	}
	
	@AfterSuite
	public void stop() {
	  app.stop();
	}
	
}
