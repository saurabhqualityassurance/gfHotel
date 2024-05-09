package com.E2logy.gfhotel.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2logy.gfhotel.utilities.WebUtil;

public class HomeLandingPageOR {

	public HomeLandingPageOR(WebUtil wu) {
		PageFactory.initElements(wu.getDriver(), this);// 8 byte
		
	}

	@FindBy(xpath="//h1[text()='WELCOME TO BOT']")
	protected WebElement welcometext;
	
}
