package com.E2logy.gfhotel.common.pages.or;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2logy.gfhotel.utilities.WebUtil;

import lombok.Getter;

@Getter
public class CommonPageOR {

	public CommonPageOR(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);// 8 byte
	}

	// _______________ login ___________________

	@CacheLookup
	@FindBy(xpath = "//input[@name='email']")
	protected WebElement userEmailTB;

	@CacheLookup
	@FindBy(xpath = "//input[@name='password']")
	protected WebElement passwordTB;

	@CacheLookup
	@FindBy(xpath = "//button[@class='btn btn-info btn-block button-green']")
	protected WebElement loginBT;

	@CacheLookup
	@FindBy(xpath = "//li[@class='nav-item']//span[text()='Checklists']")
	protected WebElement ChekListLK;

	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Inspections']")
	protected WebElement InspectionsLK;

	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='MROs']")
	protected WebElement MRosLK;
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Daily Logs']")
	protected WebElement DailylogsLK;
	
	
	//a[@class='nav-link nav-link-custom d-flex']//span[text()='Trackers']
	@CacheLookup
	@FindBy(xpath = "	//a[@class='nav-link nav-link-custom d-flex']//span[text()='Trackers']")
	protected WebElement TrackersLK;
	
	//a[@class='nav-link nav-link-custom d-flex']//span[text()='AUDITS ']
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='AUDITS ']")
	protected WebElement AdultsLK;
	

	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Action items']")
	protected WebElement ActionitemsLK;


	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Quick Links ']")
	protected WebElement QuickLinksLK;

	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Brands ']")
	protected WebElement BrandsLK;

	@CacheLookup

	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Properties']")
	protected WebElement PropertiesLK;
	
	@CacheLookup
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Templates']")
	protected WebElement TemplatesLK;
	
	@CacheLookup 
	@FindBy(xpath = "//a[@class='nav-link nav-link-custom d-flex']//span[text()='Audit Templates']")
	protected WebElement AuditTemplatesLK;
	

	@CacheLookup 
	@FindBy(xpath = "	//a[@class=\"nav-link nav-link-custom d-flex\"]//span[text()='Manage Links']")
	protected WebElement ManageLinkLK;
	
	@CacheLookup 
	@FindBy(xpath = "//a[@class=\"nav-link nav-link-custom d-flex\"]//span[text()='Users']")
	protected WebElement UsersLK;
	
	@CacheLookup 
	@FindBy(xpath = "//a[@class=\"nav-link nav-link-custom d-flex\"]//span[text()='Roles']")
	protected WebElement RolesLK;
	
	@CacheLookup 
	@FindBy(xpath = "//a[@class=\"nav-link nav-link-custom d-flex\"]//span[text()='My Account']")
	protected WebElement myAccountLK;
	@CacheLookup 
	@FindBy(xpath = "//img[@class=\"mg-b-0\"]")
	protected WebElement userclickonGfboticon;
	 
	
	
	
	
	
	
	
	
	
	
	
	// _______________ saveButton ___________________

	/**
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//input[@title='Save [Alt+S]']") protected WebElement saveBT;
	 * 
	 *               // _______________ searchForElement ___________________
	 * 
	 * @CacheLookup
	 * 
	 * @FindBys(@FindBy(xpath = "//table[@class='lvtBg']//tr[1]//td")) protected
	 *                        List<WebElement> listColumns;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBys(@FindBy(xpath = "//table[@class='lvtBg']//tr")) protected
	 *                        List<WebElement> weRowsList;
	 * 
	 *                        // _______________ Marketing ___________________
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//a[text()='Marketing']") protected WebElement marketingLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Campaigns']") protected
	 *               WebElement MarketingCampaignsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Accounts']") protected
	 *               WebElement MarketingAccountsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Contacts']") protected
	 *               WebElement MarketingContactsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Webmail']") protected
	 *               WebElement MarketingWebmailLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Leads']") protected
	 *               WebElement MarketingLeadsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Calendar']") protected
	 *               WebElement MarketingCalendarLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Documents']") protected
	 *               WebElement MarketingDocumentsLK;
	 * 
	 *               // _______________ Sales ___________________
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//a[text()='Sales']") protected WebElement SalesLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Leads']") protected
	 *               WebElement SalesLeadsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Accounts']") protected
	 *               WebElement SalesAccountsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Contacts']") protected
	 *               WebElement SalesContactsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Potentials']") protected
	 *               WebElement SalesPotentialsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Quotes']") protected
	 *               WebElement SalesQuotesLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Sales Order']") protected
	 *               WebElement SalesSalesOrderLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Invoice']") protected
	 *               WebElement SalesInvoiceLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Price Books']") protected
	 *               WebElement SalesPriceBooksLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Documents']") protected
	 *               WebElement SalesDocumentsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Sales_sub']//a[text()='Calendar']") protected
	 *               WebElement SalesCalendarLK;
	 * 
	 *               //_______________ Inventory ___________________
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//a[text()='Inventory']") protected WebElement InventoryLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Products']") protected
	 *               WebElement InventoryProductsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Vendors']") protected
	 *               WebElement InventoryVendorsLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Price Books']")
	 *               protected WebElement InventoryPriceBooksLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Purchase Order']")
	 *               protected WebElement InventoryPurchaseOrderLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Sales Order']")
	 *               protected WebElement InventorySalesOrderLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Quotes']") protected
	 *               WebElement InventoryQuotesLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Invoice']") protected
	 *               WebElement InventoryInvoiceLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Services']") protected
	 *               WebElement InventoryServicesLK;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@id='Inventory_sub']//a[text()='Assets']") protected
	 *               WebElement InventoryAssetsLK;
	 * 
	 */
}
