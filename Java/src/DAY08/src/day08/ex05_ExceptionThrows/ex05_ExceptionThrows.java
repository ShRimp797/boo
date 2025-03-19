package day08.ex05_ExceptionThrows;

import java.util.Scanner;

public class ex05_ExceptionThrows {

	
		static Scanner sc = new Scanner (System.in);
		
			public static void main(String[] args) {
	
	try {
		//input 메소드에서 예외전가했기 떄문에
		//호출한 곳에서 예외처리를 해야한다.
		input();
	}catch(Exception e){
		e.printStackTrace();
		System.err.println("정수를 입력해주세요ㅕ");
	}
	//예외전가 예외던지기' 예외 떠넘기기 -thorws
	//예외 처리에 대한 책임을 메소드를 호춣한 곳으로 떠넘기는것
	public static void input() thorws InputMismatchException {
		System.out.print("입력");
		int input= sc.nextInt(); //에외 발생 가능성 코드
		System.out.println(input);
	}
	
}
}
