package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.UserRegistration;

public class MyaccountTest extends TestBase{
	
	HomePage homeobject;
	UserRegistration registerObject ;
	LoginPage loginObject;
	MyAccountPage MyaccountObject;
	String email = "esfssmie@test.com";

	
	@Test(priority = 1)
	public void UserCanRegSucc() { 

		homeobject = new HomePage(driver);
		//exists in test base we replace it with chrome
		
		//method here exists in home page
		homeobject.OpenRegisterPage();
		registerObject = new UserRegistration(driver);
		registerObject.userRegisteration("Mona", "ahmed",email, "12345678");
//		Assert.assertTrue(registerObject.successMsg.getText().contains("Your registration completed"));
	}
	
	@Test(priority =2)
	public void RegisteredUserCanLogin() {
		homeobject.OpenLoginPage();
		loginObject=new LoginPage(driver);
		loginObject.UserLogin(email,"12345678");
	Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}
	
	@Test(priority = 3)
	public void RegisteredUserCanChangePass() {
		MyaccountObject=new MyAccountPage(driver);
		registerObject.OpenMyAccountLink();
		MyaccountObject.OpenChangePasswordLink();
		MyaccountObject.ChangePassword("87654321", "12345678","87654321");
//		Assert.assertTrue(MyaccountObject.ResultText.getText().contains("Password was Changed"));

	}

//	@Test(priority = 4)
//	public void RegisteredUserCanLogout() {
//	      try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			registerObject.LogoutUser();
//
//	}
//
//	

}
