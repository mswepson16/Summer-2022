package Cucumbers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public abstract class StepDefinitions implements WebDriver {
	public static final String URL = "https://ampeg.com/index.html";
	ChromeDriver driver;
	String result = "null";
	@Given("I open home page")
	public void i_open_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
		
	}

	@When("I go to products")
	public void i_go_to_products() {
		driver.findElement(By.cssSelector("[title = \"Products\"]")).click();
		
	}

	@And("I go to Svt Pro")
	public void i_go_to_svt_pro() {
		driver.findElement(By.cssSelector("[href = \"/products/pro/\"")).click();
		
	}

	@And("I go to classic")
	public void i_go_to_classic() {
		driver.findElement(By.cssSelector("[href = \"/products/classic/\"")).click();
		
	}

	@And("I go to svt3")
	public void i_go_to_svt3() {
		driver.findElement(By.cssSelector("[href = \"svt3pro/\"]")).click();
		
	}

	@And("I go to svt410hlf")
	public void i_go_to_svt410hlf() {
		driver.findElement(By.cssSelector("[href = \"svt410hlf/\"]")).click();
		
	}

	@And("I go home")
	public void i_go_home() {
		driver.findElement(By.cssSelector("[href = \"/\"]"));
		
	}

	@Then("I should be Home")
	public void i_should_be_at_home(){
		result = driver.getCurrentUrl();
		if (result == URL) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

	@Then("I can see artist endorsement")
	public void i_can_see_artist_endorsement() {
		 result = driver.findElement(By.cssSelector("[#artist > p > b]")).getText();
		 if (result == "Bootsy Collins") {
			 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
		 }
		 
	}
}
