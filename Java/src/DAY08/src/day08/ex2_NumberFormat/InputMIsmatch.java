package day08.ex2_NumberFormat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMIsmatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int menuNo = 0;
		String menuName="";
		
		do {
				System.out.println("1 java");
				System.out.println("2. html cass js");
				System.out.println("3.mysql db");
				System.out.println("4.servler/jsp");
				System.out.println("5.spring framework");
				System.out.println("6.react");
				System.out.println("7.ptyhon");
				System.out.println("8. django");
				System.out.println("9.node.js");
				System.out.println("10.express");
				System.out.println("11.flutter");
				System.out.println("0. 종료");
				System.out.println("입력: ");
				//예외 메시지: 	at DAY08/day08.ex2_NumberFormat.InputMIsmatch.main(InputMIsmatch.java:28)
				//예외 상황: 숫자 입력 메소드에 문자를 입력한 경우
				try{
					//예외 발생 가능성이 있는 문장
					menuNo = sc.nextInt();
				}catch(InputMismatchException e) {
					//숫자를 입력하지 않았다면, 다시 반복해서 입력하도록 처리
					sc.next();
					System.err.println("0~11번 사이의 숫자를 입력해주세요");
					continue;
				}
				
				if (menuNo == 0) break;
				switch (menuNo) {
				case 1: menuName = "spring framework"; break;
				case 2: menuName = "java"; break;
				case 3: menuName = "html css js"; break;
				case 4: menuName = "mysql db"; break;
				case 5: menuName = "servlet / jsp"; break;
				case 6: menuName = "react"; break;
				case 7: menuName = "python"; break;
				case 8: menuName = "django"; break;
				case 9: menuName = "node.js"; break;
				case 10: menuName = "express"; break;
				case 11: menuName = "flutter"; break;
					
				
				
			
			
				default:
					throw new IllegalArgumentException("Unexpected value: " + menuNo);
				}
				System.out.println(menuName + "을/를 공부합니다.");
		}while(true);
		
		sc.close();
	}
}
