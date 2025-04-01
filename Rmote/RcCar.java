package Rmote;
//RemoteControl 인터페이스 구현
//멤버변수 배터리 속력을 선언
public class RcCar implements RemoteControl{
		
	
	
	private double battery;
	private double speed;
	

	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("rc카를 작동함");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("rc카를 작동중지함");
	}
	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		System.out.println("rc카 속도 UP");
		setSpeed(MAX_SPEED);
	}
	public void changeBattery() {
		// TODO Auto-generated method stub
		System.out.println("배터리를 교체합니다.");
	}
		
		
	
	
	
}
