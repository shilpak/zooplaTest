package com.zoopla.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.LondonSalePage;
import com.zoopla.qa.pages.MainPage;
import com.zoopla.qa.pages.PropertyPage;
import com.zoopla.qa.util.TestUtil;

public class LondonSalePageTest extends TestBase {
	MainPage mainPage;
	TestUtil testUtil;
	LondonSalePage londonSalePage;
	PropertyPage propertyPage;
	
	public LondonSalePageTest() {
		//calling the constructor testbase class
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialisation();
		testUtil = new TestUtil();
		mainPage = new MainPage();
		londonSalePage = new LondonSalePage();
		londonSalePage = mainPage.searchInputValue();
	}
	
	@Test(priority=1)
	public void verifyLondonSalePageheadingTest() {
		Boolean headingTitle = londonSalePage.verifyPropertyLabel();
		Assert.assertTrue(headingTitle, "property label missing on the page");
		
	}
	
	@Test
	public void checkpriceInt() {
	 Boolean sorted = londonSalePage.priceOrder();
	 Assert.assertTrue(sorted, "numbers are not reverse sorted");
	}
	
	@Test
	public void individualPropertyPageTitle() {
		propertyPage = londonSalePage.clickOnFifth();	
	}

	

}
