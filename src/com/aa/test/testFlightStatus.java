 package com.aa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aa.pages.FlightStatusPage;
import com.selenium.core.BaseTest;

import aa.com.pages.HomePage;

public class testFlightStatus extends BaseTest {
	
	@BeforeMethod
	public void navigateBrowser() {
		getWebDriver().navigate().to(applicationUrl);
		 
	
	}
	
	@Test(dataProvider="airport")
	public void verifyHeadingOnFlightStatusPage(String org, String dest, String h1) {
		HomePage homepage=PageFactory.initElements(getWebDriver(),HomePage.class);
		FlightStatusPage flightstatus=PageFactory.initElements(getWebDriver(),FlightStatusPage.class);
		homepage.selectflightStatusTab();
		homepage.inputOrigin(org);
		homepage.inputDest(dest);
		homepage.clickFlightStatusBtn();
		String actualHeading=flightstatus.headingH1();
		Assert.assertTrue(actualHeading.contains(h1));
	}
	
	@AfterClass
	public void tearDown() {
		getWebDriver().quit();
	}

}
