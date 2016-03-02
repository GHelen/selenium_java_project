package ua.odessa.ghelen.applicationlogic;

/**
 * @author G_user
 *
 */
public interface ApplicationManager {
	
	UserHelper getUser();
	NavigationHelper getNavigationHelper();
	
	void stop();

}

