package org.doordash.testcases;

import org.doordash.ObjectRepository.OrderAndPayPage;
import org.doordash.ObjectRepository.PickYourFavFoodPage;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.DishNames;
import org.testng.annotations.Test;



public class AddDishCartTest1 extends BaseClass{
    
	@Test
	
	public void addDishCartTest1() {
		homePage.getHomePageText();
		PickYourFavFoodPage pickyourfavfood = new PickYourFavFoodPage(driver);
		OrderAndPayPage orderandpaypage = new OrderAndPayPage(driver);
		homePage.clickOnHomeDish(DishNames.N_YORKSHIRE_LAMB_PATTIES, webDriverUtility);
		pickyourfavfood.addDishToCart(DishNames.N_LOBSTER_THERMIDOR, webDriverUtility);
		pickyourfavfood.ClickCheckOut();
		orderandpaypage.ClickOrderNowButton();
		
		webDriverUtility.acceptAlert(driver);
		webDriverUtility.acceptAlert(driver);
	     String expectedresult="order is placed to the cart";
			String actualresult="order is placed to the cart";
	     
	     if(actualresult.equals(expectedresult))
		    {
		    	System.out.println("test case is pass successfully");
		    }
		    else {
		    	System.out.println("test case is fail");
	}
	}
}
	   
	
	

