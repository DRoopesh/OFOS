//user login ---> click on restaurant---> pick restaurant---> select dish----> order---> My Cart ----> delete the ordered food and logout 
package org.doordash.testcases;

import java.io.IOException;


import org.sdet40.genericUtility.BaseClass;
import org.testng.annotations.Test;

public class AutomationTestCase1_ClickRestaurantOrderTheFoodTest extends BaseClass {
	@Test

	public void TestCase1Test() throws IOException {
		String username = fileUtility.getDataFromPropertyFile("username");
		String password = fileUtility.getDataFromPropertyFile("password");
		loginPage.loginAction(username, password);
		restaurantPage.clickRestaurantTab();
		restaurantPage.clickOnRestaurantMenu(map.get("restaurant"), webDriverUtility);
		pickYourFavFoodPage.addDishToCart(map.get("dishName"), webDriverUtility);
		pickYourFavFoodPage.ClickCheckOut();
		orderAndPayPage.ClickOrderNowButton();
		webDriverUtility.acceptAlert(driver);
		webDriverUtility.acceptAlert(driver);
		System.out.println("Ordered Food Successfully");
		myOrdersPage.getLastOrder();
		myOrdersPage.deleteLastOrder(webDriverUtility);
		System.out.println("Ordered food deleted suceessfully");
		webDriverUtility.verifyAssert(soft);
	}
}