package chap98_homework_nc230317;

import chap98_homework_nc230317.print.InkPrint;
import chap98_homework_nc230317.print.LaserPrint;
import chap98_homework_nc230317.print.Print;

public class _01_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Print print = new Print();
//		InkPrint iprint = new InkPrint();
//		LaserPrint lprint = new LaserPrint();
//		
		Print print1 = new InkPrint();
		print1.page = 10;
		print1.remain = 10;
		print1.print();

		
		print1 = new LaserPrint();
		print1.page = 10;
		print1.remain = 10;
		print1.print();

		
		
		
		

	}

}

//
//car.company = "GM";
//kCar.company = "Kia";
//hCar.company = "Hyundai"; //클래스마다 하나씩 객체를 만들어주는데, 상속을 통한다면, Car 클래스 하나만으로 다양한 Car를 사용하게 된다.
//
////자식클래스는 부모의 형태도 가지고 있기 때문에
////부모클래스로 만들어진 객체에 대입가능하다.
//Car car1 = new KiaCarInherit();
//car1.company = "Kia"; //
//car1.carInfo();
//car1.speedUp();
//car1.speedDown();
//
//
//car1 = new HyundaiCarInherit();
//car1.company = "Hyundai"; // 이 company는 자식 클래스에는 없지만 부모 클래스 Car에 있으니 가져와서 입력이 가능합니다!
//car1.carInfo();
////다형성의 기초
////같은 모양의 객체로
////전혀 다른 결과값을 발현하는 성질. 오버라이딩.?
//car1.speedUp();
//car1.speedDown();