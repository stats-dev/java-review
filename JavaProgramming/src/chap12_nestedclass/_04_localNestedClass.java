package chap12_nestedclass;

import chap12_nestedclass.clazz.Car;

public class _04_localNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.speedUp(); // 함수/메소드 내에 들어가 있는 클래스들이 지역 중첩 클래스라고 한다.
	}

}
