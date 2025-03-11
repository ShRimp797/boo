package Day02;

public class EX02_CHAR {
	public static void main(String[] args) {
		//문자 데이터 : CHAR
		//리터럴 (LITERAL)
		//소스코드에 표기하는 데이터(숫자인지,문자인지,문자열인지 의미를 부여)
		char c1 = 'A';
		char c2 = 65; //<--아스키코드 문자열
		char c3 = '\u0041';//<--유니코드 문자열
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		//작은자료형 + 큰자료형 = 큰자료형
		// (c2 + 1) :(char) + (int) = (int) 자동 형변환 <--크기가 작은 자료형을 더 큰 자료형으로 변환
		// b = (c2+1) : (char) = (char) (int) 강제 형변환 <-- 큰 자료형을 더 작은 자료형으로 변환
		
		char b = (char) (c2 + 1); //<-- char 연산시 자동으로 int로 변환 / (int > char) / 형변환이 필요해서 오류가남
		
		System.out.println("c1 :" + c1);
		System.out.println("c2 :" + c2);
		System.out.println("c3 :" + c3);
		System.out.println("c4 :" + c4);
		System.out.println("c5 :" + c5);
		System.out.println("c6 :" + c6);
		System.out.println("A의 코드값:" + unicode);
		System.out.print("b :" + b);
	}
}
