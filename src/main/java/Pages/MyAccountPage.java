package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText=("Change password"))
	WebElement ChangePassLink;
	
	@FindBy(id=("NewPassword"))
	WebElement NewPassField;
	
	@FindBy(id=("OldPassword"))
	WebElement OldPassField;
	
	@FindBy(id=("ConfirmNewPassword"))
	WebElement ConfirmPassField;
	
	@FindBy(css=("button.button-1.change-password-button"))
	WebElement ChangePassBtn;
	
	@FindBy(css = "div p.content")
	public WebElement ResultText;
	
	@FindBy(linkText=("Log out"))
	private WebElement logoutUserLink;
	
	@FindBy(css=(".header-logo a img"))
	WebElement ClickLogo;
//	
	public void ChangePassword(String newPassword, String oldpassword, String confirmpassword) {
		setTextElementText(OldPassField, oldpassword);
		setTextElementText(NewPassField, newPassword);
		setTextElementText(ConfirmPassField, confirmpassword);
		clickButton(ChangePassBtn);
		
	}
	
 public void OpenChangePasswordLink() {
		clickButton(ChangePassLink);
	}

	public void UserCanLogout() {
		clickButton(logoutUserLink);
	}
	
	public void OpenLogo() {
		clickButton(ClickLogo);
	}
	}


