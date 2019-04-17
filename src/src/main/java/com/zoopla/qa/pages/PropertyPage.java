package com.zoopla.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class PropertyPage extends TestBase{	
	@FindBy(xpath="//h1[@class='ui-property-summary__title ui-title-subgroup']")
	WebElement fifithPropertyPageHeading;
	
	@FindBy(xpath="//div[@class='ui-agent__logo']//img[@class='js-lazy-loaded']")
	WebElement agentLogo;
	
	@FindBy(xpath="//div[@class='dp-sidebar-wrapper__contact']//h4[@class='ui-agent__name']")
	WebElement agentName;
	
	@FindBy(xpath="//div[@class='dp-grid-wrapper']//p[@class='ui-agent__tel ui-agent__text']")
	WebElement agentPhone;
	
	public String AgentName;
	
	public PropertyPage() {		
		//here 'this' means current class object
		PageFactory.initElements(driver,  this);
	}
	
	public boolean singlePropertyLabel() {
		return fifithPropertyPageHeading.isDisplayed();
	}
	
	public boolean agentLogo() {
		return agentLogo.isDisplayed();
	}
	
	public String agentNameText() {
		String agentId = agentName.getText();
		System.out.println(agentId);
		return agentId;
	}
	
	public String agentPhoneText() {
		String phoneNum = agentPhone.getText().replaceAll("\\D", "");
		System.out.println(phoneNum);
		return phoneNum;		
	}
	
	public AgentsDetailPage propertyAgentLabel() {	
		AgentName = agentName.getText();
		agentName.click();
		return new AgentsDetailPage();
		
	}
	
	
	
}