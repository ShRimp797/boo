package DAY03;

public class ex10_whilesum {
	public static void main(String[] args) {
		//1부터 천까지 합계구하기
		//1+2+3+.....
		
		int a = 1;
		int sum = 0;
		
		while(a <= 1000) {
			//방법1
			//sum = sum +a ;
			
			//방법2
			sum = sum + a++;
			
			//방법
			//sum = sum += a;
			
			
			
		}
		System.out.println("sum : " +sum);
	}
}