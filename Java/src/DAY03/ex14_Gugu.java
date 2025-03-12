package DAY03;

import java.util.Scanner;

public class ex14_Gugu {
	public static void main(String[] args) {
		// 구구단 1`9단
		//원하는단을 입력받아 아래와같이 작성하기
		//입력: 5
		//출력 : 5*1 .......
		
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자입력 : ");
		int input = sc.nextInt();
		for (int a = 1; a <= 9; a++) {
			System.out.println(input + "*" +  a + "=" + (input*a));
			
		}
		System.out.println();
		sc.close();
	}
}
