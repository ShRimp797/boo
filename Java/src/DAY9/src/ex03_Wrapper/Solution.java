package ex03_Wrapper;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("입력하시오");
		
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		
		char[] CharArray = str.toCharArray();
		
		for(int i = 0; i< CharArray.length; i++) {
			char ch = CharArray[i];
			if(Character.isUpperCase(ch)) {
				
			}
			else {
				CharArray[i]= Character.toUpperCase(ch);
				
			}
			
			for(char c: CharArray) {
				System.out.println(c);
			}
			sc.close();
		}
				
		
		System.out.println();
	
	
		sc.close();
	}
	
}
