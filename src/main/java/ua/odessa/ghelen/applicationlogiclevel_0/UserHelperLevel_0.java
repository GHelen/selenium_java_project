package ua.odessa.ghelen.applicationlogiclevel_0;

import ua.odessa.ghelen.applicationlogic.UserHelper;
import ua.odessa.ghelen.model.User;

public class UserHelperLevel_0 implements UserHelper {
	private User user;
	
	@Override
	public void loginAs(User user) {
		if (user.getPassword().equals("wrong")) {
		      return;
		}
		this.user= user;
	}

	@Override
	public void logout() {
		this.user =null;

	}

	@Override
	public boolean isLoggedIn() {
		return user != null;
	}

	@Override
	public boolean isLoggedInAs(User user) {
		return isLoggedIn() && this.user.getLogin().equals(user.getLogin());
	}

	@Override
	public boolean isNotLoggedIn() {
		return user== null;
	}

	}

