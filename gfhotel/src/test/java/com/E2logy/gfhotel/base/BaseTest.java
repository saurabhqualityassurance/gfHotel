package com.E2logy.gfhotel.base;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.E2logy.gfhotel.common.pages.CommonPage;
import com.E2logy.gfhotel.utilities.WebUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import lombok.Getter;

@Getter
public class BaseTest {
	private WebUtil webUtil;
	protected CommonPage reuseCode;

	@BeforeGroups(groups = "Smoke")
	public void testGroups() {

	}

	private ExtentReports extent;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Extent-Report Initialization");
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("test-output//ExtentReports//gfhotel.html");
		extent.attachReporter(spark);

	}

	@BeforeTest
	public void beforeTestTag() {
		System.out.println("Connect To The Data Base");
	}

	// @Parameters({"browser"})
	@BeforeClass
	public void beforeTestCases() {
		webUtil = WebUtil.getObject();
		webUtil.launchBrowser("chrome");
		webUtil.goToHitUrl("http://54.211.252.139/");
	}

	//// data management

	// @Parameters({"username", "password"})
	@BeforeMethod
	public void beforeMethod(Method mt) {
		ExtentTest extTest = extent.createTest(mt.getName());
		webUtil.setExtentTestObject(extTest);
		reuseCode = new CommonPage(webUtil);
		reuseCode.login("herricke@gfhotels.com", "admin@123");
	}

	@AfterMethod
	public void afterMethod(ITestResult result, Method mt) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String snapshotPath = webUtil.takeSnapshot(mt.getName());
			webUtil.getExtentTestObject().addScreenCaptureFromPath(snapshotPath);
		}

		extent.flush();
	}

	@AfterClass
	public void afterClass() {
		//webUtil.quit();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Disconnect From The Data Base");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Extent-Report Finalization");
		extent.flush();
	}

}
