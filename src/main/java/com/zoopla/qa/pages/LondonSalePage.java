package com.zoopla.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	public int priceListValues() throws InterruptedException {
		//WebElement container = driver.findElement(By.xpath("//ul[@data-role='listview']"));
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@data-role='listview']/li//a[@class='listing-results-price text-price']"));
		int value = list.size();
		System.out.println(value);
		for(int i = 0; i < value; i++) {
			System.out.println(list.get(i).getText());
		}
		return value;

	}
}
