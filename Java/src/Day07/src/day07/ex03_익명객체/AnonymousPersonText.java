package day07.ex03_익명객체;

public class AnonymousPersonText {
	
	public static void main(String[] args) {
		AnonymousPerson ap = new AnonymousPerson();
		ap.method();
		//익명 자식객체 생성
		Person person = new Person() {
			String name = "정우성";
			int age = 50;
			
			void work() {
				System.out.println(name + "("+age+")");
				System.out.println("연기를 합니다.");
			}
		};
	}
}
