package com.zoopla.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.common.collect.Ordering;
import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.util.TestUtil;


public class LondonSalePage extends TestBase {

	@FindBy(xpath=("//h1[contains(text(),'Property for sale in London')]"))
	WebElement pageHeading;
	
	@FindBy(xpath=("//li[contains(@id,'listing_')]//a[contains(@class, 'price')]"))
	List <WebElement> propertiesPriceList;

	public LondonSalePage() {		
		//here 'this' means current class object
		PageFactory.initElements(driver,  this);
	}

	public boolean verifyPropertyLabel() {
		return pageHeading.isDisplayed();
	}

	public void priceOrder() {
		List<Integer> values = new ArrayList<Integer>();
		for(WebElement e:propertiesPriceList) {
			values.add(Integer.parseInt(e.getText().replaceAll("\\D", "")));
		}
		/* Sorting in decreasing (descending) order*/
		//List<Integer> sortvalues = new ArrayList<Integer>();
		Collections.sort(values, Collections.reverseOrder());
		System.out.println("ArrayList in descending order:");

	}
	
	public PropertyPage clickOnFifth() {

		WebElement ele = propertiesPriceList.get(5);
		TestUtil.JavaScriptClick(ele);
		return new PropertyPage();	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}