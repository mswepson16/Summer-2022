package pages;

import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class SubscriptionPageObject extends PageObjectBase {
	public static final String URL = "https://ampeg.us2.list-manage.com/subscribe/post?u=5b9dfe5672b16d73721a67a0b&id=468488ec57";
	
	public SubscriptionPageObject(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
}
