package Rmote;

public class Drone implements RemoteControl{
		
	
	private double speed;
	private double battery;
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("드론을 작동함");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("드론을 작동중지함");
	}
	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		System.out.println("드론 속도 UP");
		setSpeed(MAX_SPEED);
	}
	public void changeBattery() {
		// TODO Auto-generated method stub
		System.out.println("배터리를 교체합니다.");
	}
}
