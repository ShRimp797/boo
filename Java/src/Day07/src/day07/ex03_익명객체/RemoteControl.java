package day07.ex03_익명객체;

public interface RemoteControl {
//상수
//최저속력, 최고 속력 상수를 선언하시오.
	//인터페이스 변수 선언시 public static final이 자동으로 선언됨
	 int Max_speed = 300;
	 int Min_speed = 0;
	 
	 
	 
//추상메소드
	 void turnOn();
	 void turnOff();
	 void setSpeed(int speed);
	 
	 //디폴트 메소드
	 //
	
}
