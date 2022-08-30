package tests;
import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import foundation.TestBase;
import pages.HomePageObject;
import pages.svt410hlfPageObject;


public class ampeg_test extends TestBase{
    
  
  @Test
  public void canViewProductAndGoHome() {
	 String actualUrl = new HomePageObject(this.getDriver(), this.getBaseUrl())
			 .navigate()
			 .products()
			 .svtPro()
			 .svt3()
			 .home()
			 .getCurrentUrl();
	 
	 assertEquals(actualUrl, HomePageObject.URL, "User was expected to be on the Home Page");
  }
  
  @Test
  public void canGetArtistName() {
	  String expectedName = svt410hlfPageObject.URL;
	  String artistName = new HomePageObject(this.getDriver(),this.getBaseUrl())
			  .navigate()
			  .products()
			  .classic()
			  .svt410hlf()
			  .getCurrentUrl();
	  
	  assertEquals(svt410hlfPageObject.URL,artistName,"User was expected to see ArtistName");
  }

}
