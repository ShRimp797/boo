package day07.ex05_다중구현;

public class UpCasting {
	public static void main(String[] args) {
		//업캐스팅은 자동 타입변환
		//부모에 자식을 대입
		//(부모) = (자식)
		Person person = new Student("김조은", 20,1,"문창과");
		
		//Person : name. age
		//Student : name, age, grade , major
		System.out.println("name" + person.name);
		System.out.println("age" + person.age);
		
		//person 객체에서는 자식 클래스의 변수인 grade, major에는 접근할수없다.
		//System.out.println("grade:" + person.grade) ;
		//System.out.println("grade:" + person.major ;
		
		//클래스를 업캐스팅 하면
		//변수는 부모 클래스의 변수만 접근 가능하고
		//메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		
		System.out.println(person);
		System.out.println(person.work());
		
	}
	//이유: 변수는 정적 바인딩, 메소드는 동적바인딩
	//바인딩
	//프로그램에서 사용되는 요소에 실제 값을 결정짓는 행위
	
	//정적 바인딩 : 컴파일 시간에 결정 ->변수
	//동적바인딩: 실행 시간에 결정 -> 메소드
}
