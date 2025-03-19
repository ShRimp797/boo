/*package DAY05;

public class main {
	public static void main(String[] args) {
		//객체 생성
		//클래스 타입 객체명 = new 클래스명();
		
		Person person = new Person();
		//. 접근 연산자
		person.name ="김조은";
		person.age = 20;
		
		System.out.println("이름:" +person.name);
		System.out.println("나이:" +person.age);
		person.eat("보끔당");
		person.work("코딩", 12);
		
	}
}
*/

package DAY05;

public class main {
    public static void main(String[] args) {
        // 객체 생성
        Person person = new Person();

        // 인스턴스 변수 값 할당
        person.name = "김조은";
        person.age = 20;

        // 출력
        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);

        // 메소드 호출
        person.eat("보끔당");
        person.work("코딩", 12);
    }
}
