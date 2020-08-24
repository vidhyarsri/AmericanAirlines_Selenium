package aa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
		WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		By udf = By.id("jq-flightStatus");
		By flightStatusTab = By.id("jq-flightStatus");
		By flightCheckinTab = By.id("jq-myTripsCheckIn");
		By origintxt = By.id("originAirport");
		By desttxt = By.id("destinationAirport");
		By flightstatusbtn = By.id("flightSchedulesSearchButton");
		
		public void selectflightStatusTab() {
			driver.findElement(flightStatusTab).click();
		}
		public void selectflightCheckinTab() {
			driver.findElement(flightCheckinTab);
		}
		public void inputOrigin(String org) {
			driver.findElement(origintxt).sendKeys(org);
		}
		public void inputDest(String dest) {
			driver.findElement(desttxt).sendKeys(dest);
		}
		public void clickFlightStatusBtn() {
			driver.findElement(flightstatusbtn).click();
		}
	}
