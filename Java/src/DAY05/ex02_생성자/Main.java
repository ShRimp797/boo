package DAY05.ex02_생성자;

import DAY05.main;

public class Main {
		public static void main (String[] args) {
			Student student  = new Student();
			student.name = "고건우";
			student.age = 22;
			student.major = "컴공과";
			student.stdNo = "20250001";
		
			System.out.println("::::::::::::::학생1::::::::::::::");
			System.out.println("학생1 - 이름 :" + student.name);
			System.out.println("학생1 - 나이 :" + student.age);
			System.out.println("학생1 - 전공 :" + student.major);
			System.out.println("학생1 - 학번 :" + student.stdNo);
			student.study(" 임베디드 시스템");
			
			System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(100, 90));
			
			System.out.println();
			
			Student student2  = new Student("이준영",28,"20190001","체육교육과");
					
			System.out.println("::::::::::::::학생2::::::::::::::");
			System.out.println("학생2 - 이름 :" + student2.name);
			System.out.println("학생2 - 나이 :" + student2.age);
			System.out.println("학생2 - 전공 :" + student2.major);
			System.out.println("학생2 - 학번 :" + student2.stdNo);
			student.study("축구");
			
			System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100, 90));
			System.out.println();
			
			Student student3  = new Student("윤홍민",25);
			
			System.out.println("::::::::::::::학생2::::::::::::::");
			System.out.println("학생3 - 이름 :" + student3.name);
			System.out.println("학생3 - 나이 :" + student3.age);
			System.out.println("학생3 - 전공 :" + student3.major);
			System.out.println("학생3 - 학번 :" + student3.stdNo);
			student.study("축구");
			
			System.out.println("학생3 - 중간고사 점수 : " + student3.getAverage(100, 90));
			System.out.println("학생3 - 기말고사 점수 : " + student3.getAverage(100, 90));
			
			int score3 [] = {100,90,80,70,65}
			System.out.println("학생3 - 최종점수 : " + student3.getAverage(score3));
			System.out.println();
		} 
}
