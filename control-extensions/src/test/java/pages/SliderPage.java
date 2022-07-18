package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Link;
import framework.PageObjectBase;
import framework.Slider;

public class SliderPage extends PageObjectBase{

	private final String URL = "/slider";
	
	public SliderPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public SliderPage navigate() {
		super.navigate(URL);
		
		return this;
	}
	
	public SliderPage clickSlider(String value) {
		WebElement element = getDriver().findElement(By.id(value));
		Slider slider = new Slider(element);
		slider.click();
		
		return this;
	}
	
	public SliderPage getLink() {
		
		Slider.getIsSelected();
		
		return this;
	}
}
