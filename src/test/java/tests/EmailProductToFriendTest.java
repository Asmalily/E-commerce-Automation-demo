package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EmailProductToFriendPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.UserRegistration;

public class EmailProductToFriendTest extends TestBase {



///////////////////////////register
HomePage homeobject;
UserRegistration registerObject ;
LoginPage loginObject;
SearchPage SearchObject;
String ProductName = "Apple MacBook Pro 13-inch ";
ProductDetailsPage detailObject;
EmailProductToFriendPage SendEmailObject;
String friendEmail="boala@gmail.com";
String personalMsg= "Hello my name is bella hadid ";

String email = "messfsie@test.com";

//String yourEmail="test660@test";
@Test(priority = 1)
public void UserCanRegSucc() { 

	homeobject = new HomePage(driver);
	//exists in test base we replace it with chrome
	
	//method here exists in home page
	homeobject.OpenRegisterPage();
	registerObject = new UserRegistration(driver);
	registerObject.userRegisteration("Mona", "ahmed", email, "12345678");
	Assert.assertTrue(registerObject.successMsg.getText().contains("Your registration completed"));
}



//////////////////login

@Test(priority = 2)
public void RegisteredUserCanLogin() {
	homeobject.OpenLoginPage();
	loginObject=new LoginPage(driver);
	loginObject.UserLogin(email, "12345678");
Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
}


///////////////////////search

@Test(priority = 3)
public void UsercanSearch() {

	SearchObject=new SearchPage(driver);
  SearchObject.ProductSearch("Mac");
  SearchObject.OpenProductResult();
  detailObject = new ProductDetailsPage(driver);
//  Assert.assertTrue(detailObject.productNamebreadCrumb.getText(),ProductName;
  
}
////////////////////Send email
@Test(priority = 4)
public void RegisteredUserCanSendEmail() {
	detailObject=new ProductDetailsPage(driver);
	detailObject.sendEmailAtProductPage();
	SendEmailObject=new EmailProductToFriendPage(driver);
	SendEmailObject.CanSendEmail(friendEmail,personalMsg);
	Assert.assertTrue(SendEmailObject.ResultMsgEmail.getText().contains("Your message has been sent."
			+ ""));
}

///////////////////Logout
@Test(priority = 5)
public void RegisteredUserCanLogout() {
	registerObject.LogoutUser();
}
}