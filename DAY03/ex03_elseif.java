package DAY03;

import java.util.Scanner;

public class ex03_elseif {
	public static void main(String[] args) {
		//성적을 입력받아서 성적에 따른 학점A~F까지 출력하기
		
		Scanner sc= new Scanner (System.in);
		System.out.println("성적: ");
		int score = sc.nextInt();
		char grade ='F';
		
		/*if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80){
			System.out.println("B");
		}
		else if(score >= 70){
			System.out.println("C");
		}
		else if(score >= 60){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}*/
		
		if(score >=90 && score <= 100) grade ='a';
				if(score >= 80&& score <= 100) grade ='b';
				if(score >=70 && score <= 100) grade ='c';
				if(score >= 60 && score <= 100) grade ='d';
				if(score <60 && score <= 100) grade='f';
		System.out.println("학점 :" +grade);
		
		sc.close(); 
	}
}
