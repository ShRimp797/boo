package day08.ex2_NumberFormat;

import java.util.Scanner;
/*
 * 예외처리
 * indexoutofBound
 * 배열이나 문자열의 index를 벗어나는 경우 발생하는 예외
 * */
public class IndexoutofBound {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("배열 요소의 개수 : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		System.out.println("접근할 index : ");
		int index = sc.nextInt();
		System.out.println("입력할 값: ");
		int input =sc.nextInt();
		//예외 메시지 : 
		//예외 상황 : 배열의 index를 초과하여 접근하는 경우
		try {
			arr[index] = input;
			System.out.println("arr["+ index + "]"+arr[index]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 index의 범위를 초과하여 접근하였습니다.");
			System.err.println("0 ~" + (N-1)+"사이의 정수 범위에서 입력해줴요 >:(");
		}
	
		System.out.println("arr[" + index + " ] : " + arr[index]);
		
		sc.close();
	}
}
