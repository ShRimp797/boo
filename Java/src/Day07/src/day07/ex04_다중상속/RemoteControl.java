package day07.ex04_다중상속;

public interface RemoteControl {	
	
		int max_volume = 300;
		int min_volume = 0;
		
	void turnOn();
	void turnOff();
	void setVolum(int Volume);
	void setChannel(int channel);

	default void setMenu(boolean mute) {
		if(mute) {
			
			System.out.println("음소거가 설정되었습니다.");
			setVolum(min_volume);
			
		}
		else {
			System.out.println("음소거가 해제 되었습니다.");
			setVolum(10);
		}
	}
	static void changeBettery() {
		System.out.println("배터리교체");
	}
}
