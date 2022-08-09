package Cucumbers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Feature.feature",
		glue = {"Cucumbers"}
		)

public class TestRunner {
	protected WebDriver driver;
	protected String baseUrl;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","c:\\temp\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.getDriver().manage().window().maximize();
	}
	
	@AfterClass
	public void cleanup() {
		this.getDriver().quit();
	}
	
	protected WebDriver getDriver() {
		return this.driver;
	}
	
	protected String getBaseUrl() {
		return baseUrl;
	}

	
}
