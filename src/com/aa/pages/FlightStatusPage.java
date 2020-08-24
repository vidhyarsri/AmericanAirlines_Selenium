package com.aa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightStatusPage {
	
	@FindBy(className="origindesticity")
	WebElement headingFlightStatus;
	
	public String headingH1() {
		return headingFlightStatus.getText();
	}
}