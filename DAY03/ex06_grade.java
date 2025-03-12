package DAY03;

import java.util.Scanner;

public class ex06_grade {
	public static void main(String[] args) {
		//학점을 입력받아 점수 구간을 출력하시오 a:90~100입니다.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("학점: ");
		
		//string 문자열 참조형

		// 스위치에는 문자 정수 문자열은 스위치 문의 조건값으로 가능
		//다만 실수는 불가능 함
		String grade = sc.next();
			switch (grade) {
			case "A": 
				System.out.println("90~100점입니다.");
				break;
			case "B": 
				System.out.println("80~89점입니다.");
				break;
			case "C": 
				System.out.println("70~79점입니다.");
				break;
			case "D": 
				System.out.println("60~69점입니다.");
				break;
			case "F": 
				System.out.println("60점 미만입니다.");
				break;
				
			
			default:
				System.out.println("A~F 사이의 문자를 입력해주세요.");
				
			}
		sc.close();
	}
}
