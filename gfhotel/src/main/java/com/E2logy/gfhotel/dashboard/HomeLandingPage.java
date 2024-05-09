package com.E2logy.gfhotel.dashboard;

import com.E2logy.gfhotel.utilities.WebUtil;

public class HomeLandingPage extends HomeLandingPageOR {

	private WebUtil wt;// null

	public HomeLandingPage(WebUtil wu) {
		super(wu);
		this.wt = wu;

	}

	public String getwelcomeText() {
		String text = wt.MyGetText(welcometext);

		return text;
	}

}
