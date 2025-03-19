/*package DAY05.ex03_메소드;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A :");
		int a = sc.nextInt();
		System.out.println("b:");
		int b= sc.nextInt();
		
		//뺼셈
		int result1 = calculator.sum(a,b);
		System.out.println("a + b = "+ result1);
		
		double x = sc.nextDouble();
		System.out.println("x:");
		double y = sc.nextDouble();
		System.out.println("y:");
		
		//뺼셈
		int result2 = calculator.minus(a,b);
		System.out.println("a - b = "+result2);
		
		double a = sc.nextDouble();
		System.out.println("a:");
		double b = sc.nextDouble();
		System.out.println("b:");
		
		
		//곱셈 메소드 호출
		
		double result3 = calculator.multiple(a,b);
		System.out.println("a*b=%5.2f \n ",result3);
		double result3 = calculator.multiple(a,b);
		
		
		
		
		double result4 = calculator.divide(a,b);
		System.out.println("a*b="+result4);
		System.out.println("a*b=%5.2f \n ",result4);
		
		//나머지 메소드 호출
		int result5 = calculator.remain(a,b);
		System.out.println("a%b="+ result5);
		 
		
		
		int arr[] = {10,20,30,40,50};
		System.out.println("합계: "+ calculator.sum(arr));
		System.out.println("평균: "+ calculator.avg(arr));
		sc.close();
		
		
		// printf("포맷", 변수)  : %X.Y(리터럴)
        // - X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
        //       음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
        // - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
        // * (리터럴) : %d (정수), %f (실수), %s (문자열)
		
	}
}*/


package DAY05.ex03_메소드;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        // 덧셈
        int result1 = calculator.sum(a, b);
        System.out.println("a + b = " + result1);

        // 뺄셈
        int result2 = calculator.minus(a, b);
        System.out.println("a - b = " + result2);

        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();

        // 곱셈
        double result3 = calculator.multiple(x, y);
        System.out.printf("x * y = %.2f%n", result3);

        // 나눗셈
        double result4 = calculator.divide(x, y);
        System.out.printf("x / y = %.2f%n", result4);

        // 나머지 연산 (int 타입만 허용)
        int result5 = calculator.remain(a, b);
        System.out.println("a % b = " + result5);

        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("합계: " + calculator.sum(arr));
        System.out.println("평균: " + calculator.avg(arr));

        sc.close();
    }
}

