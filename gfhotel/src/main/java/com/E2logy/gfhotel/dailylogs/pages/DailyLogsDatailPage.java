package com.E2logy.gfhotel.dailylogs.pages;

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
	
	public void selectPriority() {
	//	wt.
		
		
	}

}
