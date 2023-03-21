package chap12_nestedclass;

import chap12_nestedclass.clazz.Calc;

public class _05_anonymousClass {

	// 재밌게도 익명클래스는 따로 이름 없이 숫자로 이름이 붙게된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명 중첩 클래스 선언과 Calc 인터페이스 구현
		//익명 중첩 클래스는 추상클래스나 인터페이스를
		//구현한 클래스없이 사용할 수 있다.
		Calc cal = new Calc() {
			@Override
			public void calculator(int a, int b) {
				System.out.println("결과는 " + (a + b));
			}
		};
		
		//메인 함수에 바로 구현해서 결과도 확인 가능하다.
		cal.calculator(10, 20);

	}

}
