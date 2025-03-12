package DAY03;

public class ex09_while {
	public static void main(String[] args) {
		//1~10까지 공백을 두고 출력하기
	
		//while(조건 ) {반복실행문}
		// 반복문에는 반드시 종료조건이 성립하도록 작성하여야함
		//종료조건이 만족하지 않으면, 무한 루프에 빠진다.
		int a=1;
		while (a<=10) {
			System.out.println(a++ + " ");
			//a = a+1;
			//복합대입연산자
			//a += 1
			//증감 연산자
			//a++
			
			
		}
	}
}	
