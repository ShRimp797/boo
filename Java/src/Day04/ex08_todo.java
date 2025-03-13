package Day04;

import java.util.Scanner;

/** 할일 목록 프로그램
 * 
 * 
 * 최대 10개의 할일을 관리 할수 있는 프로그램으로
 * 메뉴를 통해 할일을 추가, 조회, 상태변경을 할 수 있는 기능을 구현 
 * 할일을 추가, 할일 목록 , 상태 변경, 프로그램 종료
 * 작업상태를 enum으로 정의하여 관리 하자
 */
// 작업상태를 나타 내는 enum
/*
 * 시작전, 진행중, 완료
 */


enum Status {
	TODO("시작전"),
	ing("진행중"),
	done("완료");

	private final String status; //상태 값을 저장하는 상수
	
	//생성자를 통해 상수의 값을 설정
	Status(String status) {
		this.status=status;
	}
	// 상태의 값을 반환하는 메소드
	public String getValue() {
		return status;
		
	}
}

class Todo{
	private String name;
	private Status status;
	
	public Todo(String name) {
		this.name = name;
		this.status = Status.TODO; //최초의 할일 상태는 todo("시작전")
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStaus() {
		return status;
	}

	public void setStaus(Status staus) {
		this.status = staus;
	}
	//alt +shift+s

	@Override
	public String toString() {
		return "("+ status + ") - "+ name;
	}

	public void setStaus() {
		// TODO Auto-generated method stub
		
	}
	
}


public class ex08_todo {
	public static void main(String[] args) {
		
		Todo[] todoList = new Todo[10]; //최대 10개의 할일
		int count = 0; //할일의 개수를 변수로 설정
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("************** 할 일 목록프로그램 **************");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할일 목록 ");
			System.out.println("3. 상태 변경");
			System.out.println("0. 프로그램 종료");
			
			int menuNo = sc.nextInt();
			sc.nextLine(); //남은 엔터제거
			if(menuNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			//todo
			
			switch (menuNo) {
			case 1:
				//할일 추가
					System.out.println("할일: ");
					String name = sc.nextLine();
					todoList[count] = new Todo(name);
					count++; //할일 개수 증가
					System.out.println("할일을 추가하였습니다.");
					System.out.println();
						break;
			case 2://할일 목록
				System.out.println("========== 할일 목록 ========== ");
				for (int i = 0; i < todoList.length; i++) {
					System.out.println((i+1)+". " +todoList[i]);
				}
				System.out.println();
				break;
				
			case 3:// 상태변경
					System.out.println("할일 번호: ");
					int index = sc.nextInt() - 1;
					sc.nextLine(); //남은 엔터제거
					
					Status[] statusList = Status.values();
					for (Status status : statusList) {
						
						//1.시작전 2. 진행중 3. 완료를 반복하는 문장
						System.out.println((status.ordinal()+1)+". " + status.getValue());
					}
					//변경할 상태 번호 입력
					int statusNo = sc.nextInt();
					sc.nextLine();
				//상태 변경
				Status updateStaus = statusList[statusNo-1];
				todoList[index].setStaus(updateStaus);
				System.out.println("상태를 " + updateStaus.getValue() + "변경하였습니다.");	
				break;	
		

			default:
					System.out.println("0~3사이의 번호를 입력하시오.");
			}
			
		}
		
		
	}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

