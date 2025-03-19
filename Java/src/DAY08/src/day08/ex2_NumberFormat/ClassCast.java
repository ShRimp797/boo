package day08.ex2_NumberFormat;


 /*
  * 예외처리
  * classcastException
  * 클래스 간의 타입 변환시, 올바르지 않은 변환으로인해 발생하는 예외
  * 업캐스팅이 전제되지 않은 다운 캐스팅을 하는 경우
  * 부모자식 관계가 아닌 클래스로 캐스팅 하는 경우
  * */


public class ClassCast {
	//부모클래스 = animal
	//자식클래스 = dog,cat
	//animla <--dog,cat upcasting
	//dog= (dog) animal<cat> downcasting (no)
	//고양이에서 업캐스팅한 애니멀을 도그로 다운캐스팅 할수없다.
	//캣을 도그로 타입 변환할수없다.
	

import java.util.Scanner;

class Animal{}

class Dog extends Animal {}

class cat extends Animal {}

	public static void changeToDog(Animal animal) { //매개변수를 받는 과정에서 업캐스팅
	 //Animal animal = new Dog();
	}							//Animal animal = new Cat();
	
	
	//예외메시지: java.lang.classCastException
	//예외상황 : 타입을 변환 할 수 없는 클래스로 변환시도 시 발생하는 예외
	public static void main(String[] args) {
		
		try {
			Dog dog = new Dog();
		}catch(Exception e) {
					System.err.println()"캣을 도그로 변환할수없습니다.";
		}
		Dog dog = (Dog) Animal;
		changeTodog(dog);
		
		cat cat = new cat();
		changeToDog(cat);
		
		Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		
		System.out.println("a :");
		a = sc.nextInt();
		
		System.out.println("b :");
		b= sc.nextInt();
		
		
		
		sc.close();
	}
}
