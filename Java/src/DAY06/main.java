package DAY06;

public class main {
		//인자전달방식 callbyvalue
	
	public static int sum(int a, int b) {
		a=100;
		b=200;
		int sum = a+b;
		System.out.println("::: sum() 메소드 :::"); //2
		System.out.println("(a,b): " +a+","+b);
		return sum;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("::: main() 매소드 호춯 :::");
		System.out.println("(a,b): "+a+"," +b);      //1
		
		int sum = sum(a,b);
		
		System.out.println("sum: " +sum);
		
		System.out.println(":::: sum 매소드 호출후 ::::"); 		//3
		System.out.println("(a,b): "+a+","+b);
	}
}
