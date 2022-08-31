package dataProvider;

public class DriverManagerFactory extends WebDriverManager{
	
	
	
	public static WebDriverManager getManager(String browserName) {
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
