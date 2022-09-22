package org.doordash.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sdet40.genericUtility.WebDriverUtility;

public class Dropdown {
	// Declarartion
		@FindBy(xpath = "(//select[@class='form-control custom-select'])[1]")
		private WebElement Dropdown1;
		@FindBy(xpath = "//select[@name='o_days']")
		private WebElement Dropdown2;
		@FindBy(xpath = "//select[@name='c_name']")
		private WebElement Dropdown3;
		@FindBy(xpath = "//select[@name='c_hr']")
		private WebElement Dropdown4;

		// Initalization
		public Dropdown(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Business library
		public Dropdown( WebDriverUtility webDriverUtility, WebDriver driver, String value) {

			// webDriverUtility.initializedropdown(Dropdown1);
			Dropdown1.click();
			Dropdown2.click();
			Dropdown3.click();
			Dropdown4.click();

			// webDriverUtility.SelectDropdownByVisibleText(value);

		}

		public WebElement addressDropdown() {
			return Dropdown1;
		}

		public WebElement addressDropdown2() {
			return Dropdown2;
		}

		public WebElement addressDropdown3() {
			return Dropdown3;
		}

		public WebElement addressDropdown4() {
			return Dropdown4;
		}

	}


