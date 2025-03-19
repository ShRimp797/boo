package day08.ex06_UserException;

public class Account {
		private long balance; //예금 잔애ㅑㄱ
		public Account() {
			
			
		}
	public long getBalance() {
		return balance;
		}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//입금
	
	//출금
	public void withdraw(int money) throws BalanceException { //에외 전가
		//(잔고)<(출금) : 출금을 못함 -> 예외 
		if(balance < money) {
			//예외강제 발생
			//throw new xxxxException();
			throw new BalanceException("잔고가 부족합니다."+ (money-balance) + "원이 부족합니다.");
			
		}
		balance -= money;
	}
}
