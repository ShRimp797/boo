package DAY03;

import java.util.Scanner;

/**
 * 입력받은 값이 홀수인지 짝수인지 조건문으로 판단하시오
 * if(조건식){ }
 * 홀수: 1,3,5,7..
 * 짝수: 2,4,6,8...
 */
public class EX02_IFELSE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 1) 
			System.out.println("홀수 입니다.");
		
		else 
			System.out.println("짝수 입니다.");
		
		sc.close();
	}
}
