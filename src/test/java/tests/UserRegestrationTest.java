package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;

public class UserRegestrationTest extends TestBase{
	
	HomePage homeobject;
	UserRegistration registerObject ;
	LoginPage loginObject;
	String email = "esfsytsie@test.com";
	
	@Test(priority = 1 ,alwaysRun = true)
	public void UserCanRegSucc() { 

		homeobject = new HomePage(driver);
		//exists in test base we replace it with chrome
		
		//method here exists in home page
		homeobject.OpenRegisterPage();
		registerObject = new UserRegistration(driver);
		registerObject.userRegisteration("Mona", "ahmed", email, "12345678");
//		Assert.assertTrue(registerObject.successMsg.getText().contains("Your registration completed"));
	}
	@Test(dependsOnMethods = "UserCanRegSucc")
	public void RegisteredUserCanLogout() {
		registerObject.LogoutUser();
	}
	@Test(dependsOnMethods = "UserCanRegSucc")
	public void RegisteredUserCanLogin() {
		homeobject.OpenLoginPage();
		loginObject=new LoginPage(driver);
		loginObject.UserLogin(email, "12345678");
	Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}

}
 