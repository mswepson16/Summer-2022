package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import dataProvider.ConfigFileReader;
import dataProvider.WebDriverFactory;
import org.openqa.selenium.edge.EdgeDriver;



public class config_tests {
  @Test
  public void canReadConfigValues() {
	  String expectedResult = "https://demoqa.com";
	  String result = new ConfigFileReader().getApplicationUrl();
	  
	  assertEquals(result, expectedResult, "expected https:// demoqa.com");
  }
  
  @Test
  public void canSelectWebDriver() {
	  String expectedResult = "";
	  WebDriver result = WebDriverFactory.getWebDriver("Edge");
	  
	  assertEquals(result, expectedResult, "expected webdriver for edge");
	  
  }
}
