package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public JavascriptExecutor jse;
   public  Select select ;

	
	//constructor
 public PageBase (WebDriver driver) {

	 PageFactory.initElements(driver, this);
 }
 protected void clickButton(WebElement button) {
	 /// for any button click
	 button.click();
 }
 ///for Send Keys
 protected void setTextElementText(WebElement textElement,String value) {
	 textElement.sendKeys(value);
 }
 
 //scroll down method
 public void scrollToBotton()
 {
 jse.executeScript("scrollBy(0,2500)");
 }
 

}
	