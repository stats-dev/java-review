package chap98_homework_nc230404;


import chap98_homework_nc230404.enums.Coffee;

public class _01_enum2 {
//	--------------------열거형--------------------
//	2. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다. 가격이 값이 되고 순서대로 2000, 3000, 4000, 4500으로 지정한다.
//	   메뉴의 총 가격을 계산하는 추상 메소드를 정의하고 각각의 상수에서 구현하는데 아메리카노(아이스 300 추가), 라떼(아이스 500 추가), 모카(휘핑 1000 추가), 
//	   콜드브루(시럽 200 추가) 모든 메뉴 옵션 없는 주문은 지정한 가격대로 진행된다. totalPrice(int optionOrder, int normalOrder) 옵션 추가 잔수와 일반 메뉴 잔수를 받아서
//	     각 메뉴의 가격을 계산하는 추상 메소드 구현한다. 아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요.

	public static void main(String[] args) {
		
		Coffee ame = Coffee.AMERICANO;
		Coffee lat = Coffee.LATTE;
		Coffee moc = Coffee.MOCHA;
		Coffee col = Coffee.COLDBREW;
		
		int total = 0;
		
		total = ame.totalPrice(2, 1) + lat.totalPrice(1, 0) + moc.totalPrice(2, 0) + col.totalPrice(0, 2);
		
		System.out.println("아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격 : " + total + "원 입니다.");
		
		
		
	}
	
	

	
	
}
