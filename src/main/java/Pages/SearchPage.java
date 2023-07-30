package Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String ProductName = "Apple MacBook Pro 13-inch";

	@FindBy(css=("button.button-1.search-box-button"))
	WebElement searchBtn;
	
	@FindBy(id=("small-searchterms"))
	WebElement searchTextBox;
	
	@FindBy(id=("ui-id-3"))
List<WebElement> ProductList;
	
	@FindBy(css =("ui-menu-item-wrapper span") )
public	WebElement ProductResult;
	
	@FindBy(linkText =("Apple MacBook Pro 13-inch"))
	WebElement ProductTitle;
	
	public void ProductSearch(String ProductName) {
		setTextElementText(searchTextBox, ProductName);
		clickButton(searchBtn);
	
	}
	public void OpenProductResult() {
		clickButton (ProductTitle);

	}}
