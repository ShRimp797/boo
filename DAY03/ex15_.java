package DAY03;

public class ex15_ {
	
	public static void main(String[] args) {
		//단(1~9)
		//단 반복 : 1~9;
	//중첩반복문
		//안쪽 반복문이 먼저 돌고 바깥쪽 반복문의 반복변수가 증가
		for (int i = 1; i <= 9; i++) {
			
			for(int b = 1 ; b <=9; b++) {
				System.out.print(b+ "*" + i + "=" + (i*b));
				System.out.print("\t "); //탭공백
			}
			System.out.println();
			
			}
	
	}

}
