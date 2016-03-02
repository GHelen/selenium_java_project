package ua.odessa.ghelen.applicationlogic;

import ua.odessa.ghelen.model.User;

public interface UserHelper {

	void loginAs(User user);
	void logout();
	boolean isLoggedIn();
	boolean isLoggedInAs(User user);
	boolean isNotLoggedIn();
//	boolean isNotloggedInAs(User user);
}
