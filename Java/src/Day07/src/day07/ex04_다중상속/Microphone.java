package day07.ex04_다중상속;

public interface Microphone  {
	int inputVolumeMax = 50;
	int inputVolumeMIn = 0;
	//음성인식볼륨
	
	//음성인식
	String receiveVoice(String voice);
	
}
