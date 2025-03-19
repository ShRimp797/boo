package day07.sigleton;



//싱글통 패턴
// 디자인 패턴중의 하나로, 생성 패턴에 속하며
//클래스의 인스턴스 메모리상에 오직 하나만 생성하여 접근하도록 하는 패턴
//개체가 필요할때, 새로운 객체를 생성하지 않고 기본의 인스턴스를 사용
//객체를 하나만 성하기ㅣ 떄문에 메모리를 효율적으로 ㅏ용
public class Singleton {
		//static 으로 유일한 객체 선언
		public static Singleton instance;
		
		private Singleton() {
			
		}
			//유일한 인스턴스를 반환하는 메소드
			public static Singleton getInstance() {
				
				if(instance == null){
					instance = new Singleton();
					return instance;
				}
				return instance;
				
			
	
	}
}	
