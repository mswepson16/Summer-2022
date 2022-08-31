package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class TextboxPage extends PageObjectBase{

	private final String URL = "/text-box";
	
	@FindBy(how = How.ID, using ="userName")
	private WebElement textboxElement;
	
	public TextboxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);		
	}
	
	public TextboxPage navigate() {
		super.navigate(URL);
		
		return this;
	}
	
	public TextboxPage setFullName(String value) {
		this.getControlExtensionFactory().getTextbox(textboxElement).setValue(value);
		
		return this;
	}
	
	public String getFullName() {
		return this.getControlExtensionFactory().getTextbox(textboxElement).getValue();
	}
}
