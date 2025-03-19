package DAY05.ex02_생성자;
/*
 * 학생
 * 이름 나이 학번 전공
 * 메소드: 공붛라기 성적 평균구하기 
 * */
 public class Student {
		//변수
	
	String name;
	int age;
	String stdNo;
	String major;
	
	//생성자
	
	//TODO : 기본생성자
	
	
	public Student(){
		name= "이름없음";
		age = 0;
		major = "전공없음";
		stdNo = "00000000000";
	}
	
	public Student(String name, int age){
		this.name=name;
		this.age =age;
		this.major = "00000";
		this.stdNo = "전공없음";
	}
	
	//TODO : 매개 변수가 있는 생성자
	public Student(String name, int age, String stdNo, String major){
		this.name=name;
		this.age =age;
		this.major =stdNo;
		this.stdNo = major;
	}
	//매소드
	//* 접근지정자 반환타입 매소드명(매개변수){}
	//- 공부하기
	//void 반환타입 없음 리턴 생략가능
	//void로 지정해도 리턴을 매소드를 종료시키는 용도로 사용할 수 있다.
	
	public void study (String subject) {
		System.out.println( subject + " 을/를 공부합니다.");
	}

		//성적 평균 구하기
		public double getAverage(int score1, int score2) {
			//TODO 평균을 구하여 반환해보세요
			
			double Average = 0.0;
			Average = (double)(score1 + score2)/2;
			
			return Average;
		}
		
		public double getAverage(int score1, int score2, int score3) {
			//TODO 평균을 구하여 반환해보세요
			
			double Average = 0.0;
			Average = (double)(score1 + score2 + score3)/3;
			
			return Average;
		}
		
 }
		
