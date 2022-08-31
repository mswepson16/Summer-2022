import org.testng.annotations.Test;

import foundation.DemoQaTestBase;
import pages.RadioButtonPage;
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
  public canSendApiCall() {
	  String expectedresult = "Link has responded with staus 201 and status text Created";
	  
  }
  
  @Test
  public canGetValue80() {
	 int expectedValue = 80; 
	 
	 assertEquals(expectedValue,result,"Expected the number 80");
  }
  
  @Test
  public canGetValue17() {
	  int expectedValue = 17;
	  
	  assertEquals(expectedValue,result,"Expected the number 17");
  }
  
  @Test
  public canGetValue0() {
	  int expectedValue=0;
	  
	  assertEquals(expectedValue,result,"Expected the number 0");
  }
  
  @Test
  public canGetValue100() {
	  int expectedValue = 100;
	  
	  assertEquals(expectedValue,result,"Expected the number 100");
  }
  
  @Test
  public canSetValueSelectMenu() {
	  
  }
  
  @Test
  public canGetAllOptions() {
	  
  }
}
