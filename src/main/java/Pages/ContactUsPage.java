package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id=("FullName"))
	 WebElement YourName;
	
	@FindBy(id=("Email"))
	WebElement YourEmail;
	
	@FindBy(id=("Enquiry"))
	 WebElement Enquiry;
	
	@FindBy(css=("button.button-1.contact-us-button"))
	 WebElement SubmitBtn;
	
	@FindBy(css=("div.result"))
	public WebElement resultMsg;
	
	public void ContactUs(String fullName,String email,String enquiry) {
		setTextElementText(YourName, fullName);
		setTextElementText(YourEmail, email);
		setTextElementText(Enquiry, enquiry);
		clickButton(SubmitBtn);

	}
}
