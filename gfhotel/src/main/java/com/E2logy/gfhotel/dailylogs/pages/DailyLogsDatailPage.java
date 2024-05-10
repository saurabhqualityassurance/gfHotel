package com.E2logy.gfhotel.dailylogs.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.E2logy.gfhotel.utilities.WebUtil;

public class DailyLogsDatailPage extends DailyLogsDatailPageOR {
	private WebUtil wt;// null

	public DailyLogsDatailPage(WebUtil wu) {
		super(wu);
		this.wt = wu;
	}

	public void fillTitle(String title) {
		wt.sendKeys(titleTB, title);
	}

	public void fillNotte(String note) {
		wt.sendKeys(noteTB, note);
	}

	public void clickPropertyTB() {
		wt.click(Property);

	}

	public void selectPriority(String expected) {
		wt.sendKeys(Property, expected);
		Actions actobj = new Actions(wt.getDriver());
		actobj.sendKeys(Keys.ENTER).build().perform();

	//	wt.customDropDown(ListProperty, expected);

	}
}
