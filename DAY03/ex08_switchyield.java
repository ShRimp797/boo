package DAY03;

import java.util.Scanner;

public class ex08_switchyield {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		String result;
		
		switch (num % 5) {
		
		case 0,1: 			
			//yield "*";  //yield 반환값;
		break;
		
		default:
			//yield "**";
	};
			//System.out.println(result);
	
		
		
		//블록의 실행문이 여러불일 경우 yield필수
		//반환값만 지정하는 경우,yield 생략 ->사용 가능
		
		
		String result2;
		switch(num % 5) {
			case 0,1: result2 = "*";
			break;
			
			default: result2 = "**";
			break;
		}
		
		System.out.println(result2);
		
		sc.close();
	}
}
