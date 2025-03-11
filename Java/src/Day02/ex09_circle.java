package Day02;

import java.util.Scanner;
//ctrl+shift + 0 한꺼번에 import
//상수
//-프로그램 실행 동안 값을 변경하지 않고 사용할 값
//상수 선언 시 반드시 값을 초기화해야됨
//선언 후에 값을 변경하면 에러가 발생
//키워드 : final
public class ex09_circle {
	public static void main(String[] args) {
		double Pi = 3.141592;
		Scanner sc = new Scanner(System.in);
		//원이 넓이
		//넓이 = 원주율*반지름^2
		
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		double area = Pi * radius * radius;
		System.out.println("원의 넓이: " + area);
		
		sc.close();
	}
}
