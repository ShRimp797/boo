package DAY03;

import java.util.Scanner;

public class ex04_nested {
	public static void main(String[] args) {
		//정보처리 기사 합격기준
		//응시자격: 대학교 4학년
		//점수:60점이상 합격
		
		Scanner sc = new Scanner (System.in);
		System.out.println("학년: ");
		int year = sc.nextInt();
		
		System.out.println("점수: ");
		int score = sc.nextInt();
		
		//합격! / 불합격! / 응시자격없음!
		
		
		if(year == 4 && score >= 60) {
			System.out.println("합격");
		}
		else if(year==4) {
			System.out.println("불합격");
		}
		else{
			System.out.println("응시자격없음");
		}
		
		
		
		/*if(year==4) {
			//60점이상
					if(score >=60) {
						System.out.println("합격");
					}
			else {
				System.out.println("불합격");
			}
				else{
					System.out.println("응시자격없음");
				}
			
		}*/
		
		
		
		
		
		//조건문은 중첩하지 않고 조건을 작성할수있음. 
		
	//-------------------------------------------- 다양한 방법
		if(year == 4 && score >= 60) {
			System.out.println("합격");
		}
		else if(year==4) {
			System.out.println("불합격");
		}
		else{
			System.out.println("응시자격없음");
		}
	//---------------------------------------- 학년 먼저 거르기
		if(year != 4) {
			System.out.println("응시자격이 없음");
		}
		else if(score >= 60) {
			System.out.println("불합격");
		}
		else{
			System.out.println("응시자격없음");
		}
		
	//---------------------------------------- 응시 자격이 있는 경우에만 접수 입력받기
		System.out.println("학년: ");
		int 학년 = sc.nextInt();
		
		if(학년!=4) {
			System.out.println("응시자격이 없음");
		}
		else {
				int 점수 = sc.nextInt();
				if(점수>=60){
					System.out.println("합격!");
				}
				else{
					System.out.println("불합격!");
				}
		}

		 //응시 자격이 있는 경우에만 점수 입력 + 중첩 if문 없애기
	if(학년 !=4) {
		System.out.println("응시자격이 없습니다.");
		return; //프로그램 종료
	}
		System.out.println("점수: ");
		int 점수 = sc.nextInt();
		if(점수>=60) System.out.println("합격");
		else System.out.println("불합격");
		
	
		sc.close();
	}
}

