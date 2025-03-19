package day08.ex1trycatch;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
			System.out.println("a:  ");
			int a =  sc.nextInt();
			
			System.out.println();
			System.out.println("b : " );
			int b = sc.nextInt();
				
			try{
				int result = a/ b;
				System.out.println("result" + result);
				
			}
			catch (Exception e) {
				System.err.println("예외발생");
				System.err.println("0으로 나눌수없습니다.");
				
			}
			finally {
				System.out.println("예외처리 완료");
			}
		}
	}


