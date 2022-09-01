package framework;

public class Car{
	
	private String model;
	
	private int odometer;
	
	public Car(String model) {
		
	}
	
	IEngine engine = v8;

	public int getOdometer() {
		return odometer;
	}
	
	LargeEngine v8 = new LargeEngine();
	
	
	public void Start() {
		// TODO Auto-generated method stub
		LargeEngine.start();
	}

}
