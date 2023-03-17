package chap06_class;

import chap06_class.car.Car_answer;

public class _06_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_answer car1 = new Car_answer();
		Car_answer car2 = new Car_answer("현대");
		Car_answer car3 = new Car_answer("현대", "제네시스");
		Car_answer car4 = new Car_answer("현대", "아반떼", "검정");
		Car_answer car5 = new Car_answer("기아", "K9", "파란", 4000);
		
		car1.carInfo();
		System.out.println("---------------------");
		car2.carInfo();
		System.out.println("---------------------");
		car3.carInfo();
		System.out.println("---------------------");
		car4.carInfo();
		System.out.println("---------------------");
		car5.carInfo();
		
		
		

	}

}
