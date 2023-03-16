package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체화 (인스턴스화)
		Add add = new Add(); // 이 Add가 다른 패키지에 있으니 import ctrl+shift+o
		Minus min = new Minus(); // 이런 것을 생성자라고 하는데 이걸 살펴본다.
		Multiple multi = new Multiple(); // 이걸 설계도 대로 부품을 만드는 작업이라 할 수 있다. 클래스가 설계도 이다.
		Divide divi= new Divide();
		
		// public 이니 어디서든 이 멤버변수 접근 가능하다!
//		add.num1 = 10;
//		add.num2 = 20; 
//		add.result = add.num1 + add.num2;
			
		
		// private 이면 안되므로 이때 필요한게 getter setter.
		// 보안을 위해서 private 권장 + setter, getter 가져와서 진행하면 됩니다.
		add.setNum1(10);
		add.setNum2(20);
		//add.setResult(add.getNum1() + add.getNum2()); // getNum1() 10이 되고, getNum2() 20이다.
		//근데 이거하면 되는지 확인한다.
		System.out.println(add.add());
		
		min.setNum1(10);
		min.setNum2(20);
		//minus.setResult(minus.getNum1() - minus.getNum2());
		System.out.println(min.min());
		
		
		multi.setNum1(10);
		multi.setNum2(20);
		//multiple.setResult(multiple.getNum1() + multiple.getNum2());
		System.out.println(multi.multi());

		
		
		divi.setNum1(10);
		divi.setNum2(20);
		//divide.setResult(divide.getNum1() + divide.getNum2());
		System.out.println(divi.divi());

		//객체마다 인스턴스를 만들어줘야 한다.
		
		System.out.println(add.add());
		System.out.println(min.min());
		System.out.println(multi.multi());
		System.out.println(divi.divi());

		//설계도로 부품 만드는 작업 == 인스턴스화, 객체화
		//인스턴스화: 생성자를 통해서 객체를 생성하고 
		//			heap 메모리 영역에 저장한다.
		//			항상 new 키워드와 함께 사용
		Calc cal = new Calc();
		
		
		
		
		
		// return 값이 있어서 출력 가능함.
		System.out.println(cal.add(10,20));
		
		int receiveNum = cal.add(10, 20);
		//리턴 값을 받아주는 변수가 없으면 결과가 메모리에 저장되지 않고
		//연산이 일어난 후 삭제
		cal.add(10, 20);
		
		// int 값 나오니까 그걸 반환하고, 30이 넘어가고, 두번째는 2가 넘어가서, 30 - 2 = 28
		System.out.println(cal.minus(cal.add(10, 20), cal.divide(20, 10)));
		
		
		Calc cal2 = new Add(); // 이렇게 cal2을 Add 부품 선언
		System.out.println(cal2.add(4, 3)); // 16 + 9
		
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3)); // 16 - 9, 상속받은 것은 부모모양의 객체가 포함되므로, 그 객체를 넣을 수도 있다.
		
		
		
		

	}

}
