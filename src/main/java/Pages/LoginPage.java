package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	@FindBy(id=("Email"))
	WebElement EmailField;
	@FindBy(id=("Password"))
	WebElement passwordField;
	@FindBy(css="button.button-1.login-button")
	WebElement loginButton;
	
	//@FindBy(id=("RememberMe"))
	//WebElement rememberbtn;
	
	//@FindBy(css="button.button-1.register-button")
//	WebElement registerbutton;
	
public void UserLogin(String Email ,String Password ) {
	
	setTextElementText(EmailField, Email);
	setTextElementText(passwordField ,Password);

	clickButton(loginButton);
}
}

