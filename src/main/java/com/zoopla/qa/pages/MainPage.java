package com.zoopla.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class MainPage extends TestBase {

	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement searchInput;
	
	public MainPage() {		
		//here 'this' means current class object
		PageFactory.initElements(driver,  this);
	}
	
	public String validateMainPageTitle() {
		return  driver.getTitle();
	}
	
	public LondonSalePage searchInputValue() {
		searchInput.sendKeys("London");
		searchInput.submit();
		return new LondonSalePage();
		
	}
	
}


