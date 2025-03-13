package Day04;
//Enum(열거타입) 정의
// 열거타입 enum은 파이롤도 정의할 수 있고,
// 클래스 파일 내부에서 정의 할 수도 있다.

enum Test {a,b,c,d,e,f};

public class ex07_Enum {
	public static void main(String[] args) {
		//enum(열거타입)
		//요소들을 명명한 값으로 집합을 이루는 자료형
		//특징
		//1. enum을 비교할 떄는 값 뿐만 아니라 타입도 비교한다.
		//2. enum의 상수값이 재정의 되어도 다시 컴파일 할 수 있다.
		
		//enum 관련 메소드
		// values() : 열거타입의 모든 요소를 배열로전환
		// valueof() : 전달된 문자열과 일치하는 열거타입 상수를 반환
		// ordinal() : 헤당 열거타입 상수가 정의된 순서를 반환
		
		Rainbow[] rainbow = Rainbow.values();
		
		for(Rainbow color : rainbow) {
			System.out.println(color+" ");
		}
		System.out.println();
		
		Rainbow G = Rainbow.valueOf("purple");
		System.out.println("g : " + G);
		
		int index = G.ordinal();
		System.out.println("purple의index: " +index);
		
	}
}


