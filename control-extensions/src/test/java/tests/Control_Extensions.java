package tests;
import org.testng.annotations.Test;

import foundation.DemoQaTestBase;
import pages.RadioButtonPage;
import pages.SliderPage;
import pages.TextboxPage;

import static org.testng.Assert.assertEquals;



public class Control_Extensions extends DemoQaTestBase {
  @Test
  public void canUseYesRadio() {
	  boolean expectedValue = true;
	  RadioButtonPage result = new RadioButtonPage(this.getDriver(), this.getBaseUrl())
		  .navigate()
		  .selectRadioButton("yesRadio")
		  .getRadioButton("yesRadio");
	  
	  assertEquals(result,expectedValue,"Expected Yes Selected");
  }
  
  @Test
  public void canUseImpressiveRadio() {
	  boolean expectedValue = true;
	  RadioButtonPage result = new RadioButtonPage(this.getDriver(), this.getBaseUrl())
		  .navigate()
		  .selectRadioButton("impressiveRadio")
		  .getRadioButton("impressiveRadio");
	  assertEquals(result,expectedValue,"Expected Impressive Selected");
  }
  
  @Test
  public void canUseNoRadio(){
	  boolean expectedValue = false;
	  RadioButtonPage result = new RadioButtonPage(this.getDriver(), this.getBaseUrl())
		  .navigate()
		  .selectRadioButton("noRadio")
		  .getRadioButton("noRadio");
	  assertEquals(result,expectedValue,"Expected No Selected");
  }
  
  @Test
  public void canSendApiCall() {
	  String expectedresult = "Link has responded with staus 201 and status text Created";
	  
  }
  
  @Test
  public void canGetValue80() {
	 String expectedValue = "80"; 
	 String result = new SliderPage(this.getDriver(),this.getBaseUrl())
			 .navigate()
			 .setSlider("80")
			 .getValue().toString();
	 
	assertEquals(expectedValue,result,"Expected the number 80");
  }
  
  @Test
  public void canGetValue17() {
	  String expectedValue = "17";
	  String result = new SliderPage(this.getDriver(),this.getBaseUrl())
				 .navigate()
				 .setSlider("17")
				 .getValue().toString();
	  assertEquals(expectedValue,result,"Expected the number 17");
  }
  
  @Test
  public void canGetValue0() {
	  String expectedValue="0";
	  String result = new SliderPage(this.getDriver(),this.getBaseUrl())
				 .navigate()
				 .setSlider("0")
				 .getValue().toString();
	  assertEquals(expectedValue,result,"Expected the number 0");
  }
  
  @Test
  public void canGetValue100() {
	  String expectedValue = "100";
	  String result = new SliderPage(this.getDriver(),this.getBaseUrl())
				 .navigate()
				 .setSlider("100")
				 .getValue().toString();
	  assertEquals(expectedValue,result,"Expected the number 100");
  }
  
  @Test
  public void canSetValueSelectMenu() {
	  
  }
  
  @Test
  public void canGetAllOptions() {
	  
  }
}
