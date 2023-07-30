package tests;

import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class SearchProduct extends TestBase {
	SearchPage SearchObject;
	String ProductName = "Apple MacBook Pro 13-inch ";
	ProductDetailsPage detailObject;
	

	@Test
	public void UsercanSearch() {

		SearchObject=new SearchPage(driver);
	  SearchObject.ProductSearch("Mac");
	  SearchObject.OpenProductResult();
	  detailObject = new ProductDetailsPage(driver);
//	  Assert.assertTrue(detailObject.productNamebreadCrumb.getText(),ProductName;
	  
	}
}
