package com.E2logy.gfhotel.dailylogs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2logy.gfhotel.utilities.WebUtil;

public class DailyLogsDatailPageOR {

	public DailyLogsDatailPageOR(WebUtil wu) {
		PageFactory.initElements(wu.getDriver(), this);
		
	}

	@FindBy(xpath="//input[@name='title']")
	protected WebElement titleTB;
	
	@FindBy(xpath="//textarea[@name='note']")
	protected WebElement noteTB;
}
