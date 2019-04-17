package com.zoopla.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.LondonSalePage;
import com.zoopla.qa.pages.MainPage;
import com.zoopla.qa.pages.PropertyPage;
import com.zoopla.qa.util.TestUtil;

public class PropertyPageTest extends TestBase{
	MainPage mainPage;
	TestUtil testUtil;
	LondonSalePage londonSalePage;
	PropertyPage propertyPage;
	
	public PropertyPageTest() {		
		//the super word will call the base class constructor
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialisation();
		testUtil = new TestUtil();
		mainPage = new MainPage();
		londonSalePage = new LondonSalePage();
		londonSalePage = mainPage.searchInputValue();
		propertyPage = londonSalePage.clickOnFifth();
	}
	
	@Test(priority=1)
	public void verifyPropertySalePageheadingTest() {
		Boolean propertyHeadingTitle = propertyPage.singlePropertyLabel();
		Assert.assertTrue(propertyHeadingTitle, "property label missing on the page");		
	}
	
	@Test(priority=2)
	public void agentLogoTest() {
		Boolean logo = propertyPage.agentLogo();
		Assert.assertTrue(logo, "logo is missing");		
	}
	
	@Test(priority=3)
	public void agentNameTest() {
		propertyPage.agentNameText();		
	}
	
	@Test(priority=4)
	public void agentPhoneTest() {
		propertyPage.agentPhoneText();		
	}
	
	@Test(priority=5)
	public void propertyAgentLabelTest() {
		propertyPage.propertyAgentLabel();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
