package ex05String;

import java.util.Scanner;

public class Lotto {
		public static void main(String[] args) {
			
	//1		
	int lotto[] = new int[7];
	
		for(int i = 0; i < 7; i++) {
			int random = (int)(Math.random() * 100 + 1 );
			lotto[i] = random;
			
			
		}
		for (int i = 0; i< lotto.length;i++) {
			System.out.print(lotto[i] + " ");
			
		}
			
		System.out.println();
		
		/***/
		
		int lotto2[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 100 + 1 );
			lotto2[i] = random;
			
			
		}
		for (int i = 0; i< lotto2.length;i++) {
			System.out.print(lotto2[i] + " ");
			
		}
		System.out.println();
		if (lotto == lotto2)	
		{
			System.out.println(1);
			
		}
		else {
			System.out.println(0);
		}
			
		}
}
