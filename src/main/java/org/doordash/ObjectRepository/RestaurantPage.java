package org.doordash.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sdet40.genericUtility.WebDriverUtility;

public class RestaurantPage {
	private WebDriver driver;
	private String restaurantMenuDynamicXpath = "//a[text()='%s']"; 	//%s-->Restaurant Name


public RestaurantPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//a[text()='Restaurants ']")
private WebElement restaurantTab;

@FindBy(xpath="//a[text()='View Menu']")
private WebElement resturantPageText;

public String getResturantPageText() {
	return resturantPageText.getText();
}

public void clickRestaurantTab() {
	restaurantTab.click();
}

public void clickOnRestaurantMenu(String restaurant, WebDriverUtility webDriverUtility) {
	webDriverUtility.convertDynamicXpathToElement(restaurantMenuDynamicXpath, restaurant, driver).click();
}


/**
 *  Click resturant
 */

// declaration

@FindBy(xpath = "(//span[.='Restaurant'])")
private WebElement click2;

// initalization
public void Resturant(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

// businee liibrary
public void Resturant() {
	click2.click();
}

// clicking Add Resturant
@FindBy(xpath = "(//a[@href='add_restaurant.php'])")
private WebElement click3;

// initalization
public void ADDResturant(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void AddResturant() {
	click3.click();
}


//Resturant details
// Declaration
@FindBy(xpath = "(//input[@name='res_name'])")
private WebElement Resname;
@FindBy(xpath = "(//input[@name='phone'])")
private WebElement Mobno1;
@FindBy(xpath = "(//label[text()='Bussiness E-mail']/ancestor::div[@class='form-group has-danger']//input[@type='text'])")
private WebElement email;
@FindBy(xpath = "(//label[text()='Website URL']/ancestor::div[@class='form-group has-danger']//input[@type='text'])")
private WebElement Website1;

// Initalization
public void Sendkeys(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void Sendkeys(String Restname, String Mobno, String Email, String Website) {
	Resname.sendKeys(Restname);
	Mobno1.sendKeys(Mobno);
	email.sendKeys(Email);
	Website1.sendKeys(Website);

}
/**
 * This method used for passing the address
 */

// Declaration
@FindBy(xpath = "(//textarea[@name='address'])")
private WebElement Addresss;

// Initalization
public void Address1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

// Business library
public void Address1(String Address) {
	Addresss.sendKeys(Address);

}

// Declaration
// Subit
@FindBy(xpath = "(//input[@type='submit'])")
private WebElement submit4;

// Initalization
public void Submit1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

// Business library
public void Submit1() {
	submit4.click();
}
}

























