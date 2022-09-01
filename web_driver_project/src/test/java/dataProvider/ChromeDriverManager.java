package dataProvider;


public class ChromeDriverManager extends WebDriverManager{
	public void createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", DRIVER_DIR + "chromedriver.exe");
	}	
}