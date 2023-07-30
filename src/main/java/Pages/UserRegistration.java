package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistration extends PageBase{

	public UserRegistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "gender-male")
	WebElement genderRdoBtn;
	
	
	@FindBy(id = "FirstName")
	WebElement fnTxtBox;
	
	@FindBy(id = "LastName")
	WebElement InTxtBox;
	
	@FindBy(id = "Email")
	WebElement EmailTxtBox;
	
	@FindBy (id = "Password")
	WebElement PassTxtBox;
	
	
	@FindBy (id = "ConfirmPassword")
	WebElement confirmPassTxtBox;
	
	@FindBy (id= "register-button")
	WebElement registerBtn;
	
    @FindBy (css="div.result")
   public WebElement successMsg;
    
    @FindBy(linkText=("Log out"))
  public  WebElement logoutLink;
    
    @FindBy(linkText=("My account"))
    WebElement MyaccuntLink;
    
 
	//step for function , press on register : gender selecet, filling fields
	public void userRegisteration(String FirstName ,String LastName ,String  Email ,String Password) {
		clickButton(genderRdoBtn);
		setTextElementText(fnTxtBox,FirstName);
		setTextElementText(EmailTxtBox, Email);
		setTextElementText(InTxtBox, LastName);
		setTextElementText(PassTxtBox, Password);
		setTextElementText(confirmPassTxtBox, Password);
		clickButton(registerBtn);
	
	}
	public void LogoutUser() {
		clickButton(logoutLink);
	}
	
	public void OpenMyAccountLink() {
		clickButton(MyaccuntLink);
	}
}
