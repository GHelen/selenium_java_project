package ua.odessa.ghelen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends EveryPage {

	public LoginPage(PageManager page) {
		super(page);
	}

	@FindBy(id = "Email")
	private WebElement loginField;
	
	@FindBy(id = "Password")
	private WebElement passwordField;
	
	@FindBy(css = "input.button-1.login-button")
	private WebElement submitButton;

	public LoginPage setLoginField(String text) {
		loginField.clear();
		loginField.sendKeys(text);
	    return this;
	}

	public LoginPage setPasswordField(String text) {
		passwordField.clear();
		passwordField.sendKeys(text);
	   	return this;
	}

	public LoginPage clickSubmitButton() {
		submitButton.click();
		return this;
	}
	
}
