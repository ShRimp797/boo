package DAY03;

import java.util.Scanner;

public class switchbreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력: ");
		int num = sc.nextInt();
		//입력받은 정수를 5로 나눈 나머지가 2보다 작으면 * 출력 그렇지 않으면 **출력
		//스위치 문을 이용하시오
		//num %5 <2 "*"  print
	
			switch (num % 5) {
			case 0:
				System.out.println("*");
				break;
			case 1:
				System.out.println("*");
				break;
			case 2:
				System.out.println("**");
				break;
			case 3:
				System.out.println("**");
				break;
			case 4:
				System.out.println("**");
				break;
				
			}
			//-------------------------- break가 없으므로 쭉쭉 내려가다가 브레이크가 걸리면 코드 종료도 가능!
			switch (num % 5) {
			case 0:
			case 1:	System.out.println("*");
				break;
			case 3:
			case 4:
				System.out.println("**");
				break;
				
			}
			//----------------------------default에 넣어서 종료해도 가능
			
			//결론: 브레이크가 안걸리면 계속 직동됨 브레이크가 있으면 코드 종료
		sc.close();
	}
}
