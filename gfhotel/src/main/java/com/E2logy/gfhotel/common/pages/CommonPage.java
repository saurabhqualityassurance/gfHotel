package com.E2logy.gfhotel.common.pages;

import com.E2logy.gfhotel.common.pages.or.CommonPageOR;
import com.E2logy.gfhotel.utilities.WebUtil;

public class CommonPage extends CommonPageOR {
	private WebUtil wt;// null

	public CommonPage(WebUtil wu) {
		super(wu);
		this.wt = wu;
	}

	//__________________ LOGIN  _______________
	
	
	public void login(String userName, String password) {
		wt.windowMaximize();
		wt.myIplicitilyWait(30);
		wt.sendKeys(getUserEmailTB(), userName);
		wt.sendKeys(getPasswordTB(), password);
		wt.click(getLoginBT());
	}

	// _______________ INSPECTIONS Method ______________
	
	
	public void goToCheckList() {
		wt.click(ChekListLK); 
	}
	public void goToInspections() {
		wt.click(InspectionsLK); 
	}
	public void goToMros() {
		wt.click(MRosLK); 
	}
	public void goToDailylogs() {
		wt.click(DailylogsLK); 
	}
	public void goToTrackers() {
		wt.click(TrackersLK); 
	}
	
	// _______________ AUDLTS Methods ___________________

	public void goToAdults() {
		wt.click(AdultsLK); 
	}
	public void goToActionItems() {
		wt.click(ActionitemsLK); 
	}
	public void goToQuickLinksLK() {
		wt.click(QuickLinksLK); 
	}
	
	// _______________ SETTING Methods ___________________

	public void goToQuickLinks() {
		wt.click(QuickLinksLK); 
	}
	
	
	//_________________ MASTER DATA _______________________
	
	public void goToBrands() {
		wt.click(BrandsLK); 
	}
	public void goToProperties() {
		wt.click(PropertiesLK); 
	}
	public void goToTemplates() {
		wt.click(TemplatesLK); 
	}
	public void goToAuditTemplates() {
		wt.click(AuditTemplatesLK); 
	}
	public void goToManageLink() {
		wt.click(ManageLinkLK); 
	}
	public void goToUsers() {
		wt.click(UsersLK); 
	}
	public void goToRoles() {
		wt.click(RolesLK); 
	}
	public void goTomyAccountLK() {
		wt.click(myAccountLK); 
	}
	public void userClickOnGFBotIcon() {
		wt.click(userclickonGfboticon); 
	}
 }