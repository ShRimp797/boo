package Day02;

import java.util.Scanner;

public class ex10_asignhmenyoperater {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x: ");
		int x =sc.nextInt();
		
		System.out.print("Y: ");
		int y = sc.nextInt();
		
		System.out.print("Z: ");
		int z = sc.nextInt();
		
		int sum =x + y + z;
		double avg = sum /3;
		
		//double = int / int
		//* int는 정수 자료형으로, 실수의 소수부분을 표현할수 없다.
		
		//큰자료형 + 작은 자료형 = 큰자료형
		// - 서로다른 자료형 연산시, 결과는 큰 자료형으로 변환된다.ㅣ
		
			System.out.println("합계 : " +sum);
			System.out.println("평균: " + avg);
			
			double realAvg1= (double) sum /3;
			double realAvg2 = sum / 3.0 ;
			
			System.out.println("평균1: " + realAvg1);
			System.out.println("평균2: " + realAvg2);
			//avg 평균변수가 정수형 이라서 소수부분을 표현할 수 없다.
			// 평균을 소수점까지 표현하기 위해서는 실수형으로 변환해야 한다.
			
		sc.close();
	}
	
}
