package org.sdet40.genericUtility;

import java.util.Map;

import org.doordash.ObjectRepository.AdminHomePage;
import org.doordash.ObjectRepository.Dropdown;
import org.doordash.ObjectRepository.RestaurantPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddResturantTestCaseTest extends BaseClass {
	WebDriver driver;

	@Test
	public void AddResturantTest() throws InterruptedException {
		// TODO Auto-generated method stub
	//	Map<String, String> map = excelUtility.getDataFromExcelInMap("AddingResturant");
		String URL = map.get("adminurl");
		String UN = map.get("adminusername");
		String PWD = map.get("adminpassword");
		String value = map.get("Dropdownvalue");
		String Dropdowntext = map.get("Dropdowntext");
		String Dropdownvalue2 = map.get("Dropdownvalue2");
		String Dropdowntext2 = map.get("Dropdowntext2");
		String Address = map.get("deliveryAddress");
		String Restname = map.get("restaurant");
		String Mobno = map.get("phoneNumber");
		String Email = map.get("email");
		String Website = map.get("Website");
		System.out.println(" Website ");
    	webDriverUtility = new org.sdet40.genericUtility.WebDriverUtility();
		driver = webDriverUtility.openBrowserWithApplication("chrome", 10, URL);
		Admin=new AdminHomePage(driver);
		Admin.loginAction(UN, PWD);
		RestaurantPage RestaurantPage = new RestaurantPage(driver);
		RestaurantPage.Resturant();
		RestaurantPage.AddResturant();
		RestaurantPage.Sendkeys(Restname, Mobno, Email, Website);
		Dropdown Dropdown = new Dropdown(driver);
		WebElement k = Dropdown.addressDropdown();
		webDriverUtility.DropdownByValue(k, value);
		WebElement t = Dropdown.addressDropdown2();
		webDriverUtility.DropdownByText(t, Dropdowntext);
		WebElement r = Dropdown.addressDropdown3();
		webDriverUtility.DropdownByText(r, Dropdownvalue2);
		WebElement y = Dropdown.addressDropdown4();
		webDriverUtility.DropdownByText(y, Dropdowntext2);
		RestaurantPage.Address1(Address);
		driver.findElement(By.xpath("//input[@name='file']"))
		.sendKeys(IConstantPath.PROJECT_PATH + "/src/test/resources/screenshot.png");
		RestaurantPage.Submit1();
		webDriverUtility.closeTheBrowser(driver);
	}
}
