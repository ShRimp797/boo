package DAY05.ex03_메소드;
/*
 * 계산기
 * 피연산자를 2개로 하는 계산기
 * 기능 
 * 덧셈 : 정수 2개ㅡㄹ 덧셈
 * 뺄셈 : 정수 인자 1 -인자2 연산을 하는 뺄셈
 * 나눗셈: 실수인자1 인자2 연산을 하는 나눈ㅅ셈
 * 나머지: 실수인자%인자2 연산을 하는 나눗셈
 * 합계 배열로 매개변수를 전달받아. 모든요소의 합을 구함
 * 
 * 메소드명 plus minus multiple  divide remain  sum avg
 * 
 * */
public class Calculator {
	
	//덧셈
	public int plus(int a, int b) {
		int result= a+b;
		return result;
	}
	
	//뺄셈
	public int minus(int  a, int  b) {
		int result=a-b ;
		return result;
	}
	
	//곱셈
	public double multiple(double a,double b) {
		double result= a*b;
		return result;
	}
	
	//나누기
	public double divide(double a,double b) {
		double result= a/b;
		return result;
	}
	//나머지
	public int remain(int a, int b) {
		int result= a%b;
		return result;
	}
	
	//합계
	public int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i< arr.length; i++)
		{
			sum += arr[i];
			}
		return sum;
	}
	//평균
		public double avg (int[] arr) {
			int sum = sum(arr);
			double avg = (double ) sum / arr.length;
			return avg;
}
		public int sum(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
}
