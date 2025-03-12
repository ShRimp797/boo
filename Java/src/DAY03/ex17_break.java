package DAY03;

import java.util.Scanner;

public class ex17_break {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//무한루프 : 반드시 종료조건을 추가해 주어야 한다.
		while(true) {
			System.out.println("입력: ");
			String input = sc.nextLine();
			
			if(input.equals("stop"))
				//문자열.equals("바교문자열) : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
				break;
			
			System.out.println(">>" +input);
		}
		sc.close();
	}
}
