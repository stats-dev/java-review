package chap06_class.car;

import java.util.Scanner;

public class Car {
	//제조사(company), 모델(model), 색상(color), 가격(price) : 4개의 멤버변수 public으로 만들기
	//public
	String[] company = new String[2];
	String[] model = new String[2];
	String[] color = new String[2];
	int[] price = new int[2];
	
	
	int index = 0;
	
	//void carInfo() -> 입력한 자동차 정보를 출력한다.
	//제조사: 현대
	//모델: 제네시스
	//색상: 검정
	//가격: 5000
	//이렇게 출력하도록 만들기

	
	public void carInfo(String company, String model, String color, int price) {
		// 입력함수 제작
		this.company[index] = company;
		this.model[index] = model;
		this.color[index] = color;
		this.price[index] = price;
		index++;
		
		//printAllCarInfo();
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		
		

		
	}
	

	//모든 PhoneInfo 출력
//	public void printAllCarInfo() {
//		for(int i = 0; i < company.length; i++) {
//			if(company[i] != null && model[i] != null  && color[i] != null) { // price[i] != null 이건 안된다.
//				System.out.println("제조사 : " + company[i]);
//				System.out.println("모델 : " + model[i]);
//				System.out.println("색상 : " + color[i]);
//				System.out.println("가격 : " + price[i]);
//			}
//		}
//	}
//	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.carInfo("현대", "제네시스", "검정", 5000);
		car.carInfo("르노삼성", "마티즈", "빨강", 0);
		//car.carInfo(null, null, null, 0);
//		for(int i=0;i<this.company.length;i++) {
//			
//		}
		
		//car.printAllCarInfo();
	}
	

}
