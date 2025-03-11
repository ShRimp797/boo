package Day02;

import java.util.Scanner;

public class ex07_boolean {
	public static void main(String[] args) {
		//boolean
		// : true, false 논리값만 가지는 자료형
		
		boolean check1 = false;
		boolean check2 = true;
		
		Scanner sc = new Scanner(System.in);
		boolean on = sc.nextBoolean(); //논리값(true,false)를 입력받는 메소드
		
		System.out.println("on : " + on);
		
		if(on) {
			System.out.println("전원on");
		}
		else {
			System.out.println("전원 off");
		}
		sc.close();
	}
}
