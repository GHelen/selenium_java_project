/**
 * 
 */
package ua.odessa.ghelen.applicationlogiclevel_0;

import ua.odessa.ghelen.applicationlogic.ApplicationManager;
import ua.odessa.ghelen.applicationlogic.NavigationHelper;
import ua.odessa.ghelen.applicationlogic.UserHelper;

/**
 * @author G_user
 *
 */
public class ApplicationManagerLevel_0 implements ApplicationManager {

	UserHelper userHelper = new UserHelperLevel_0();
		
	@Override
	public UserHelper getUser() {
		return userHelper;
	}


	@Override
	public void stop() {
		
	}


	@Override
	public NavigationHelper getNavigationHelper() {
		// TODO Auto-generated method stub
		return null;
	}

	

}


