package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory extends WebDriverManager{
	
	
	
	public static WebDriver getWebDriver(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			return getChromeDriver();
			
		case "edge":
			return getEdgeDriver();
			
		default:
			throw new IllegalArgumentException("Match case not found for browser: " + browserName);
		
		}
		
	}

	
}
