package Rmote;

public interface RemoteControl {

	
		int MAX_SPEED = 200;
		int MIN_SPEED = 0;
		
		void turnOn();
		void turnOff();
		void setSpeed(int speed);
		
		
		default void Driving (boolean check) {
			
			if (check) {
				System.out.println("작동합니다.");
				setSpeed(10);
			} else {
					System.out.println("작동을 중지합니다.");
					setSpeed(MIN_SPEED);
			}
		}
		
		
		
		static void changeBattery() {
			System.out.println("배터리를 교체합니다.");
		}
		
		
		
		
}
