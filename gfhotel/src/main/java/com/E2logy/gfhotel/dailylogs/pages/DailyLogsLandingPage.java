package com.E2logy.gfhotel.dailylogs.pages;

import com.E2logy.gfhotel.utilities.WebUtil;

public class DailyLogsLandingPage extends DailyLogsLandingPageOR {
	
	private WebUtil wt;// null

	public DailyLogsLandingPage(WebUtil wu) {
		super(wu);
		this.wt = wu;
	}


	public void clickDailyLogsBT() {
		wt.click(dailyLogsBT);
	}
	
	
}
