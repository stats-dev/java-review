package chap98_homework_nc230328;

import chap98_homework_nc230328._07_class.Account;

public class _07_class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
		Account ac = new Account();
		ac.balance = 10000; //만원
		System.out.println("현재 잔액: " + ac.searchBalance());
		System.out.println("입금: " + ac.searchDeposit(50000));
		System.out.println("출금: " + ac.searchWithdrawal(5000));
		System.out.println("현재 잔액: " + ac.searchBalance());
		

	}

}
