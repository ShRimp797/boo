package DAY03;

public class ex13_for {
	public static void main(String[] args) {
		// for(1초기식 ; 2조건식 ; 4증삼식) {3실행문}
		// 실행순서: 1 -> 반복 (2->3->4)
		
		//1.1~10 까지 정수출력 / 2. 50~100까지 정수출력 / 3. 1~20까지 정수 중 짝수만 출력 / 4.1~20까지 정수중 홀수만 출력
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
			
		}
		System.out.println();
		
		for (int x = 50; x <= 100; x++) {
			System.out.println(x + " ");
			
		}
		System.out.println();
		
		for (int b = 2; b<=20 ; b++) {
			if(b%2==0)
			System.out.println(b + " ");
			
		}
		System.out.println();

		
		
		for (int b = 1; b <= 20 ; b+=2) {
					System.out.println(b + " ");
			
		}
		System.out.println();
	}
}
