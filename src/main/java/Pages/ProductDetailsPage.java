package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(
            css = "strong.current-item"
    )
    public WebElement productNamebreadCrumb;

    @FindBy(css=("button.button-2.email-a-friend-button"))
  public  WebElement EmailBtnAtProductPage;
    
    @FindBy(id=("price-value-4"))
	public
    WebElement PriceValue;
    
    @FindBy(linkText=("Add your review"))
 public   WebElement AddReviewLink;
    
    public void ShowProductBreadCrumb() {
    	clickButton(productNamebreadCrumb);
    }
    
    public void sendEmailAtProductPage() {
    	clickButton(EmailBtnAtProductPage);
    }
       	public void OpenAddReviewLink() {
       		clickButton(AddReviewLink);
       	}
    
}
