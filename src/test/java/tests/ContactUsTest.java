package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ContactUsPage;
import Pages.HomePage;

public class ContactUsTest extends TestBase	{
	
	ContactUsPage ContactObject;
	HomePage HomeObject;
	String enquiry= "Hello, My name is Bella Hadid";
	String email = "emssie@test.com";
	String fullName="Ahmed Mohsen";
	
	@Test
	public void OpenContactUs()
	{
		HomeObject = new HomePage(driver);
		HomeObject.OpenContactUsPage();
		ContactObject=new ContactUsPage(driver);
		ContactObject.ContactUs(fullName,email ,enquiry);
		Assert.assertTrue(ContactObject.resultMsg.getText().contains(
	"Your enquiry has been successfully sent to the store owner."));

	}
}
