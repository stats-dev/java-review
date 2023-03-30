package chap98_homework_nc230328._07_class;

public class Account {
//	6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
	
	public int balance;
	
	public int searchDeposit(int deposit) {
		balance = balance + deposit;
		return deposit;
	}
	
	public int searchWithdrawal(int withdrawal) {
		balance = balance - withdrawal;
		return withdrawal;
	}
	
	public int searchBalance() {
		return balance;
	}
	
	
	
}
