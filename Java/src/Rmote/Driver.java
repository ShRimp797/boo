package Rmote;

public class Driver {
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("****Rc카****");
		RcCar rccar = new RcCar();
		rccar.turnOn();
		rccar.turnOff();
		rccar.changeBattery();
		
		System.out.println();
		
		System.out.println("****드론****");
		Drone drone = new Drone();
		drone.turnOn();
		drone.turnOff();
		drone.changeBattery();
	
		
		
		
	}
}
