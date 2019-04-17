package com.zoopla.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.AgentsDetailPage;
import com.zoopla.qa.pages.LondonSalePage;
import com.zoopla.qa.pages.MainPage;
import com.zoopla.qa.pages.PropertyPage;
import com.zoopla.qa.util.TestUtil;

public class AgentSDetailPageTest extends TestBase{
	
	MainPage mainPage;
	TestUtil testUtil;
	LondonSalePage londonSalePage;
	PropertyPage propertyPage;
	AgentsDetailPage agentDetailPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialisation();
		testUtil = new TestUtil();
		mainPage = new MainPage();
		londonSalePage = new LondonSalePage();
		londonSalePage = mainPage.searchInputValue();
		propertyPage = londonSalePage.clickOnFifth();
	}
	
	@Test
	public void verifyAgentName() {
		agentDetailPage = propertyPage.propertyAgentLabel();
		Assert.assertTrue(agentDetailPage.getAgentName().contains(propertyPage.AgentName));
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
