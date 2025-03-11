package Day02;

public class ex05_long {
	public static void main(String[] args) {
		// int(4byte : 32bits) : 2^32개 : 약 42억개
		// int 수 표현 범위       : -21억xxx ~ 21억xxx
		
		//long (8bytes : 64bits) 2^64ro
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
		//L을 붙이지 않으면 기본정수는 int타입으로 인식 되므로 21억을 표현 할수없음
		System.out.println("ln1: " + ln1);
		System.out.println("ln2: " + ln2);
		System.out.println("ln3: " + ln3);
	}
}
