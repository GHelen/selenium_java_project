package ua.odessa.ghelen;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import ua.odessa.ghelen.model.User;

public class LoginTest extends TestBase {
	

		@BeforeMethod
		public void ifAlredyLogged()  {
			try {
				if (app.getUser().isLoggedIn())  
					app.getUser().logout();
				}
			catch (Exception e) {
			}
			}
		

		@Test
		public void TestLoginOK() throws Exception {
			User user = new User().setLogin("g_new@inbox.ru").setPassword("qazQAZ1");
			app.getUser().loginAs(user);
			assertTrue(app.getUser().isLoggedInAs(user));
		}

		@Test
		public void TestLoginFail() throws Exception {
			User user = new User().setLogin("g_new@inbox.ru").setPassword("11");
			app.getUser().loginAs(user);
			assertTrue(app.getUser().isNotLoggedIn());
		}
	}


