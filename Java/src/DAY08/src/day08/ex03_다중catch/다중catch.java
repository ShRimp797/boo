package day08.ex03_다중catch;

import java.util.Iterator;
import java.util.Scanner;

public class 다중catch {
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
		
		try {
			System.out.println(input1[0] + input2[1]);
			System.out.println(input2[0]+input2[1]);
			
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1+"+"+str2 +"=" + result);
		}catch(NumberFormatException e) {
			System.err.println("숫자로 변환할수없는 값입니다. 문자입력시");
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("숫자로 변환할수없는 index입니다. 한자리 수만 입력시");
		}catch(Exception e)		{
			System.out.println("이외의 알수없는 예외 발생");
		}
		
				sc.close();
		
	}
}
