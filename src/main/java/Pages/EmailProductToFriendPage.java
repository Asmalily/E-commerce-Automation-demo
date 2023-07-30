package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailProductToFriendPage extends PageBase {

	public EmailProductToFriendPage(WebDriver driver) {
		super(driver);

		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id=("FriendEmail"))
	WebElement FriendEmailBox;
	
//	@FindBy(id=("YourEmailAddress"))
//	WebElement YourEmailBox;
	
	@FindBy(id=("PersonalMessage"))
	WebElement PersonalMsgBox;
	
	@FindBy(name =("send-email"))
	WebElement SendEmailBtn;
	
	@FindBy(css=("div.result"))
	public
	WebElement ResultMsgEmail;
	
	public void CanSendEmail(String friendEmail, String personalMsg)
	{
		setTextElementText(FriendEmailBox, friendEmail);
//		setTextElementText(YourEmailBox, yourEmail);
		setTextElementText(PersonalMsgBox, personalMsg);
		clickButton(SendEmailBtn);
		
		
	}
}
