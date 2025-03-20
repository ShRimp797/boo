package ex03_Wrapper;


public class DoubleEx {
	
	public static void main(String[] args) {
		// Double
		// double -> Double
		// : 실수타입인 double 기본타입을 객체화한 클래스
		//double a = null 기본타입은 null지정불가 - null은 참조자료형에 만 쓸수있다.
		//Double 은 class
		Double d = 3.14;
			System.out.println( d.toString() + 0.06 );				// 실수형 -> 문자열
			System.out.println( Double.parseDouble("3.14") + 0.06 );// 문자열 -> 실수형
		
	}

}
