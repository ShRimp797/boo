package Day02;

public class ex14_bitoperator {
	public static void main(String[] args) {
		//and
		int result = 20 & 16;
		System.out.println("20&16=" +result);
		System.out.println(Integer.toBinaryString(20));//<-- 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		//or
		int result2 = 20 | 16;
		System.out.println("20|16=" + result2);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		//xor <--다르면 1 true 같으면 0 false
		int result3 = 20^16;
		System.out.println("20^16=" +result3);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		
		//왼쪽 시프트 연산 (<<)
		int a = 5;
		int result4 = a<<1;
		System.out.println(result4);
		
		//오른쪽 시프트 연산 (>>)
				int b = 10;
				int result5 = a>>2;
				System.out.println(result5);
	}
}
