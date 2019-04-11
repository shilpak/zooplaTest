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


public class LondonSalePage extends TestBase {

	@FindBy(xpath=("//h1[contains(text(),'Property for sale in London')]"))
	WebElement pageHeading;

	public LondonSalePage() {		
		//here 'this' means current class object
		PageFactory.initElements(driver,  this);
	}

	public boolean verifyPropertyLabel() {
		return pageHeading.isDisplayed();
	}

	public boolean priceOrder() {
		List<Integer> values = new ArrayList<Integer>();
		List<WebElement> items = driver.findElements(By.xpath("//ul[@data-role='listview']/li//a[@class='listing-results-price text-price']"));		
		for(WebElement e:items) {
			values.add(Integer.parseInt(e.getText().replaceAll("\\D", "")));
		}
		/* Sorting in decreasing (descending) order*/
		List<Integer> sortvalues = new ArrayList<Integer>();
		Collections.sort(values, Collections.reverseOrder());
		System.out.println("ArrayList in descending order:");
		for(Integer num: values){
			sortvalues.add(num);
		}
		return  Ordering.natural().reverse().isOrdered(sortvalues);
	}
	
	public PropertyPage clickOnFifth() {
		List<WebElement> items = driver.findElements(By.xpath("//ul[@data-role='listview']/li//a[@class='listing-results-price text-price']"));		
		WebElement ele = items.get(5);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		return new PropertyPage();	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}