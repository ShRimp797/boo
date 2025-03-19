package day08.ex2_NumberFormat;

import java.util.Scanner;

public class DivideByZero{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("a :");
		int a = sc.nextInt();
		System.out.println("b :");
		int b = sc.nextInt();
		
		//예외메시지 상황 
		//예외상황 : 어떤수를 0으로 나누는 경우는 수학적ㅇ로 정의되어 있지얺않아 예외처리
		//에외처리 try~catch;
		try {
			
			System.out.println("a / b=" (a/b));
		}
		//catch 예외타입객체
		//exception (최상위 예외 클래스)
		//exception d으로 지정하면 모든 예외 상황에 대해 처리한다.
		
		catch (ArithmeticException e) {
			//예외발생시 실행할 예외처리 문장
			System.err.println("영으로 나누는 연산은 수학적으로정의되지 않았습니다.")
			finally {	
				//주로 예외 처리와 관련된 문장을 작성
				System.out.println("메모리를 해제 합니다.");
				
				
				sc.close();
				System.out.println("프로그램을 종료합니다");
				
				
				
				
				
			}
		}

	


