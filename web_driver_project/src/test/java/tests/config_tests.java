package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import dataProvider.ConfigFileReader;
import dataProvider.TestBase;


public class config_tests extends TestBase{
  @Test
  public void canReadConfigValues() {
	  String expectedResult = "https://demoqa.com";
	  String result = new ConfigFileReader().getApplicationUrl();
	  
	  assertEquals(result, expectedResult, "expected https:// demoqa.com");
  }
  
  @Test
  public void canSelectWebDriver() {
	  String expectedResult = "103.0.1264.62";
	  String result = getDriverVersion("Edge");
	  
	  assertEquals(result, expectedResult, "expected version details for edge");
	  
  }
}
