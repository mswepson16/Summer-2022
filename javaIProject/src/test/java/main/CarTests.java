package main;
import org.testng.annotations.Test;

import framework.Car;


public class CarTests {
  @Test
  public void canBuildCar() {
	  
	  Car myCar = new Car("Corvette");
	  
	  myCar.Start();
  }
}
