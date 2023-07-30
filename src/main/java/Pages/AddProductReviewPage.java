package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductReviewPage extends PageBase {

	public AddProductReviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	@FindBy(id=("AddProductReview_Title"))
	WebElement ReviewTitle;
	
	@FindBy(id=("AddProductReview_ReviewText"))
	WebElement ReviewText;
	
	@FindBy(id=("addproductrating_4"))
	WebElement Rating4RadioBtn;
	
	@FindBy(name=("add-review"))
	WebElement ReviewSubmitBtn;
	
	@FindBy(css=("div.result"))
	public WebElement AddReviewMsg;
	
	
	public void AddReviewToProduct(String reviewText, String reviewTitle) {
		setTextElementText(ReviewText, reviewText);
		setTextElementText(ReviewTitle, reviewTitle);
		clickButton(Rating4RadioBtn);
		clickButton(ReviewSubmitBtn);
	}
	
	

}
