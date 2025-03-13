package Day04;

import java.util.Scanner;

public class ex02_max {
	public static void main(String[] args) {
		//첫번째 줄에 입력할 개수 n을 입력받고
		//둘째 줄에 n갸의 정수를 공백으로 입력을 받의오
		//n개의 정숮ㅇ 최대값을 수하시오
		//(입력)
		//5
		//90 60 70 100 55
		//(출력)
		//최댓값 : 100
		
		
		/*
		 	(순서도)
		 	1. 냄비에 물붓기
		 	2.물을 끓인다.
		 	3.스프를 넣는다.
		 	4.라면을 넣는다.
		 	5.먹는다.
		 	
		 	
		 	
		 	1.정수 하나를 입력받아서 n에대입
		 	2.n개 요소를 갖는 배열 arr 선언 및 생성
		 	3.n번 반복하면서 정수를 입력받아 배열 arr에 순서대로 대입
		 	4.배열을 반복해서 최댓값 max를 배열 i번째 요소랑 비교
		 	5.두 요소중 더 큰 요소를 max에 대입 
		 	6. 반복 끝나고 max를 출력한다.
		 	
		 	
		  	interger.min_value : -21억xxx : int의 최소값
		 */
		
		
		Scanner sc = new Scanner (System.in);
		//1.
		int n = sc.nextInt();
		//2.
		int arr[] = new int [n];
		//3.
		
			for (int i = 0; i <n; i++) {
				arr[i] =sc.nextInt();
				}
				
			int max = 0;
			for (int i = 0; i <n; i++) {
				if(max < arr [i]) {
			//5.
					max = arr[i];
				}
			}
				System.out.println("최댓값: " +max);
				
				sc.close();
	}
}




