package day08.ex04_멀티catch;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.nextLine();
		//string 문자배열로 변환
		String str2 = sc.nextLine();
		
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
		//문자배열을 문자열배열로 변환
		//char1 -> [1][0]
		//input1 -> ["1"]["0"]
		String [] input1 = new String[char1.length];
		String [] input2 = new String[char2.length];
	for (int i = 0; i < char2.length; i++) {
		input1[i] =  char1[i] + "";
	}
		for (int i = 0; i < input2.length; i++) {
			input2[i] = char2[i] + "";
		}
		//멀티catch
		//하나의 catch 블록에서 처리하고 싶은 예외를 |기호로 연결하여 함꼐 처리하는ㄱ섯
		try {
			System.out.println(input1[0] + input2[1]);
			System.out.println(input2[0]+input2[1]);
			
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1+"+"+str2 +"=" + result);
		}catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.err.println("숫자로 변환할수없는 값입니다. 문자입력시");
			System.err.println("숫자로 변환할수없는 index입니다. 한자리 수만 입력시");
		}catch(Exception e)		{
			System.out.println("이외의 알수없는 예외 발생");
		}
		
				sc.close();
		
	}
}
