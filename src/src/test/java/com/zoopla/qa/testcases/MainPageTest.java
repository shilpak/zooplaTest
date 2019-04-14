package com.zoopla.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.LondonSalePage;
import com.zoopla.qa.pages.MainPage;
import com.zoopla.qa.util.TestUtil;

public class MainPageTest extends TestBase {
	
	MainPage mainPage;
	TestUtil testUtil;
	LondonSalePage londonSalePage;
	
	public MainPageTest() {

		//calling the constructor testbase class
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialisation();
		testUtil = new TestUtil();
		mainPage = new MainPage();
	}
	
	@Test(priority=1)
	public void verifyMainPageTitleTest() {
		String title = mainPage.validateMainPageTitle();
		Assert.assertEquals(title, "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
	}
	
	@Test(priority=2)
	public void searchInputValueTest() {
		
		londonSalePage = mainPage.searchInputValue();

	}

}
