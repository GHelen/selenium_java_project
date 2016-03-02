package ua.odessa.ghelen.model;

public class User {

	private String firstName = "";
	private String lastName = "";
	private String login = "";
	private String email = "";
	private String password = "";
	
	public String getEmail() {
			return email;
		}

	public User setEmail(String email) {
			this.email = email;
			return this;
		}

	public String getFirstName() {
		return firstName;
	}
	public User setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

	public String getLastName() {
		return lastName;
	}

	public User setLastName(String lastName) {
		this.lastName = lastName;
		return this; 
	}

	public String getPassword() {
		return password;
	}
	
	public User setPassword(String password) {
		this.password=password;
		return this;
	}

	public String getLogin() {
		return login;
	}

	public User setLogin(String login) {
		this.login=login;
		return this;
	}
}
