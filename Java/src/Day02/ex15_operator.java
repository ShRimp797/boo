package Day02;

public class ex15_operator {
	public static void main(String[] args) {
		int a = 3 ,b = 5;
		
		//a와 b 두수의 차이 (절댓값)을 구하시오
		// a-b=-2
		//b-a=2
		//조건연산자 (삼항연산자)
		//-조건 ? 참일떄 값 : 거짓일때 값
		int result = (a>b)? a-b : b-a;
		System.out.println("두 수의 차:"+result);
		
		//조건 연산자를 if조건문으로 쓰면
		if(a>b)
			result = a-b;
		else
			result = b-a;
		System.out.println("result: " + result);
	}
}
