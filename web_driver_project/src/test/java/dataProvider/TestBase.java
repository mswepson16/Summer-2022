package dataProvider;

public abstract class TestBase extends DriverManagerFactory{
	public String getDriverVersion(String driver) {
		String driverVersion = DriverManagerFactory.getManager(driver).toString();
		
		return driverVersion;
	}
}
