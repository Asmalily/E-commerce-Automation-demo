package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		jse=(JavascriptExecutor) driver;
	}
	@FindBy(linkText = "Register")
	WebElement registerLink ;	
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(linkText=("Contact us"))
	public WebElement ContacUsLink;

	
	@FindBy(name=("customerCurrency"))
	WebElement CurrencyScroll;
	
	
	
	public void OpenRegisterPage() {
	clickButton(registerLink);
	}
	public void OpenLoginPage() {
	clickButton(LoginLink);
	}
	
	// open conact us by scoll down
	public void OpenContactUsPage() {
		scrollToBotton();
		clickButton(ContacUsLink);
		
	}
	
	////////////change currancy
	
	public void ChangeCurrency() {
        select = new Select(CurrencyScroll);
        select.selectByVisibleText("Euro");
	}

}

