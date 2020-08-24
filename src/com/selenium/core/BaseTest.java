package com.selenium.core;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public abstract class BaseTest {
	private WebDriver driver;
	protected String applicationUrl;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Mywork\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		this.applicationUrl = "http://www.aa.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	@DataProvider(name = "airport")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { "DFW", "LAX", "Dallas/ Fort Worth to Los Angeles" },
				{ "DFW", "ATL", "Dallas/ Fort Worth to Atlanta" }, { "DFW", "ORD", "Dallas/ Fort Worth to Chicago" } };
	}
}