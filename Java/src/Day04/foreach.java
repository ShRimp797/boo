package Day04;

public class foreach {
	public static void main(String[] args) {
		//배열 선언 및 초기화
		String[] week = {"월","화","수","목","금","토","일"};
		
		//foreach : ctrl + space
		// -for (자료형 반복요소명 : 베열) { }
		//배열 또는 컬렉션의 모든 요소를 순서대로 전부 반복하는 반복문
		
		for (String day : week) {
			System.out.println(day + " ");
		}
		System.out.println();
		
		for(int i = 0; i < week.length; i++) {
			System.out.println(week[i] + " ");
		}
		System.out.println();
	}
}
