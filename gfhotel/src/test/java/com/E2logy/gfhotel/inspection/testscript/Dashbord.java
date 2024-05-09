package com.E2logy.gfhotel.inspection.testscript;

import org.testng.annotations.Test;

import com.E2logy.gfhotel.base.BaseTest;
import com.E2logy.gfhotel.common.pages.CommonPage;
import com.E2logy.gfhotel.dashboard.HomeLandingPage;
import com.E2logy.gfhotel.utilities.WebUtil;

public class Dashbord extends BaseTest {

	@Test()
	public void tc01VerifyDashBord() {

		WebUtil weobj = WebUtil.getObject();
		HomeLandingPage homeLandingPage = new HomeLandingPage(weobj);
		String welcomeText = homeLandingPage.getwelcomeText();
		weobj.verifText(welcomeText, "WELCOME TO BOT", "Welcome text");

//		BasePage bs = new BasePage(weobj);
//		bs.goToCheckList();
//		weobj.HoldOn(3000);
//		weobj.GoBackPage();
//		bs.goToInspections();
//        bs.getUserclickonGfboticon();
//	

	}
}
