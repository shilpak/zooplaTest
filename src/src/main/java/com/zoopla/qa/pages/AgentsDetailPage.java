package com.zoopla.qa.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class AgentsDetailPage extends TestBase{
	
	@FindBy(xpath="//h1[@class='bottom-half']/b")
	WebElement agentPageLabel;
	
	public AgentsDetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getAgentName() {
		return agentPageLabel.getText();
	}

}
