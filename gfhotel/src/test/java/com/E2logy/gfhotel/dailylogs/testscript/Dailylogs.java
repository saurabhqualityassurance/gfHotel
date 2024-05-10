package com.E2logy.gfhotel.dailylogs.testscript;

import org.testng.annotations.Test;

import com.E2logy.gfhotel.base.BaseTest;
import com.E2logy.gfhotel.common.pages.CommonPage;
import com.E2logy.gfhotel.dailylogs.pages.DailyLogsDatailPage;
import com.E2logy.gfhotel.dailylogs.pages.DailyLogsLandingPage;
import com.E2logy.gfhotel.utilities.WebUtil;

public class Dailylogs extends BaseTest {

	@Test
	public void verifyVT004() {
	
		WebUtil weobj = WebUtil.getObject();
		CommonPage commonPage= new CommonPage(weobj);
		commonPage.goToDailylogs();
		DailyLogsLandingPage DailyLogsLandingPage= 	new DailyLogsLandingPage(weobj);
		DailyLogsLandingPage.clickDailyLogsBT();
		DailyLogsDatailPage DailyLogsDatailPage=	new DailyLogsDatailPage(weobj);
		DailyLogsDatailPage.fillTitle("Xyz");
		DailyLogsDatailPage.fillNotte("note");
		DailyLogsDatailPage.clickPropertyTB();
		DailyLogsDatailPage.selectPriority("DEV TEST HOTEL");
		
		
	}
	
	
}
