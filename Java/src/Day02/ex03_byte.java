package Day02;

public class ex03_byte {
	public static void main(String[] args) {
		//byte 는 1byte 범위의 정수 데이터를 표현
		//1byte = 8bits (0000 0000) : 2^8 : 256개 
		//양수와 음수로 나누면, -128 ~ 127 범위로 표현가능
		 
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 =(byte) 128; 
				// <--강제형 변환
				// 에러 type mismatch
				// 자료형 타입이 불일치, 데이터 범위 벗어남 (overflow)
		System.out.print("var1 : " + var1);
		System.out.print("var2 : " + var2);
		System.out.print("var3 : " + var3);
		System.out.print("var4 : " + var4);
		System.out.print("var5 : " + var5);
	}
}	
