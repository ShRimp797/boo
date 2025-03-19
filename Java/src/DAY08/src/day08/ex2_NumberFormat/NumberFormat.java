package day08.ex2_NumberFormat;
public class NumberFormat {
	/**
	 * 예외처리
	 * NumberFormatException
	 * 문자열 숫자 ("10")이 아닌 문자열을 숫자타입으로 변환시 발생하는 예외상황
	 * ex)"10A" -> 숫자로 변환하면 예외
	 * "10" -> 10
	 * **/
	public static void main(String[] args) {
		String strNum ="10";
		int num = 10;
		//string + int
		//string + string = string
		//+문자열 연결 연산자
		System.out.println("10 + 20 = " + (strNum + 20));
		//+ 산술연산자
		System.out.println("10 + 20 =" + (num + 20));
		
		String numberString = " 10";
		String numberAndString = "A10";
				//Integer.parseInt("문자열숫자")
				// 문자열 숫자를 int 타입의 숫자로 변환 하는 메소드
				int num1 = Integer.parseInt(numberString);
				
				System.out.println("numberString + 5 = " + (numberString + 5));
				
				int num2 = 0;
				//예외문장 : Exception in thread "main" java.lang.NumberFormatException: For input string: " 10"
				//예외상황 : 문자열 숫자가 아닌 문자열을 숫자로변환할 수 없기 떄문에 예외 발생
				try{
					num2 = Integer.parseInt(numberAndString);
					
				}catch(NumberFormatException e) {
					System.err.println("문자열숫자가 아닌 문자열을 숫자타입으로 변환 할수없습니다.");
				}
				
				
				System.out.println("num1 + 10 = "+ (num1 +10));
				System.out.println("num2 : " + num2);
	}
}

