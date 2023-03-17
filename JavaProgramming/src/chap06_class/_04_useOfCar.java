package chap06_class;

import chap06_class.car.Car_answer;

public class _04_useOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부품 만들기(인스턴스화)
		Car_answer car = new Car_answer();
		
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		
		car.carInfo();
		
		// 다른 변수 만드려면? 부품 하나를 더 만들면 되겠다.
		Car_answer car2 = new Car_answer();
		
		car2.company = "기아";
		car2.model = "K9";
		car2.color = "하얀";
		car2.price = 4000;
		// String은 null, int는 0으로 초기화 된다.
		
		car2.carInfo();
		

	}

}
