package day07.ex04_다중상속;
	//인터페이스는 다중상속 가능 인터페이스명 extends 인터페이스a 인터ㅠ페이스 ㅠ{}
	public interface SmartRmoteControl extends RemoteControl, Microphone {
		
	//터치패드 기능
		//xy죄표위치에 터치패드 클릭
		void touch(int x,int y);
	}	

	