package DAY06;

import EX05.pikachu;

public class callbyreference {
	//배열을 전달받아 배열 요소를 변경하는 메소드
	
	public static void setArr(int[] arr) {
		for(int i=0; i< arr.length; i++)
		{
			arr[i]=(i+1)*10;
		}
		System.out.println("::: setArr( ) 메소드 :::");
		for(int i: arr ) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
	//객체를 전달받아 객체의 변수를 변경하는 메소드
	public static void setObject(pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "물";
		System.out.println("::: setObject() 메소드 :::");
		System.out.println(pikachu);
		System.out.println();
	}
	
	public static void main(String[] args) {
		//배열의 객체를 생성하여 메소드로 전달해보디
		int arr[] = {1,2,3,4,5};
		Pikachu pikachu = new Pikachu();
		
		System.out.println("::: main 메소드 :::");
		for (int i : arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
		
		setArr(arr);
		setObject(pikachu);
		
		System.out.println("::: setxxx 메소드 호출 후 :::");
		for(int i : arr) {
			System.out.println(i+ "");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
	}
}
