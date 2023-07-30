package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class SelectCurrencyTest extends TestBase {

	HomePage homeObject;
	SearchPage SearchObject;
	String ProductName = "Apple MacBook Pro 13-inch ";
	ProductDetailsPage detailObject;
	
	
	//////Change currency
	@Test(priority = 1)
	public void CanChangeCurrency() {
		homeObject=new HomePage(driver);
		homeObject.ChangeCurrency();
	}
	
	
	///////////////search product
	@Test(priority = 2)
	public void UsercanSearch() {

		SearchObject=new SearchPage(driver);
	  SearchObject.ProductSearch("Mac");
	  SearchObject.OpenProductResult();
	  detailObject = new ProductDetailsPage(driver);
	  Assert.assertTrue(detailObject.PriceValue.getText().contains("€"));
	  
	}
}
