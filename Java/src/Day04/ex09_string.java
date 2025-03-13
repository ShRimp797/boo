package Day04;

public class ex09_string {
	public static void main(String[] args) {
		//string은 참조 자료형
		// 문자열 한 글자씩 그 자체를 비교할 때는 equals()를 사용
		
		//문자열 사용방법
		//1. 문자열 리터럴("")로 지정
		//2. 문자열 객체 생성

		//문자열 리터럴
		String a ="hello";
		String b ="Java";
		String c ="hello";
		
		String d = new String("hello");
		String e = new String("JAVA");
		String f = new String("JAVA");
		
		System.out.println("a == c : " + (a == c)); 
		System.out.println("a == d : " + (a == d));
		System.out.println("문자열 비교: " + a.equals(d));
		
		System.out.println("e == f: " + (e == f)); //레퍼런스 비교
		System.out.println("문자열비교 : "  + e.equals(f));
		
	}
}
