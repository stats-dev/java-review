package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체화 (인스턴스화)
		Add add = new Add(); // 이 Add가 다른 패키지에 있으니 import ctrl+shift+o
		Minus min = new Minus(); // 이런 것을 생성자라고 하는데 이걸 살펴본다.
		Multiple multi = new Multiple();
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
		System.out.println(min.minus());
		
		
		multi.setNum1(10);
		multi.setNum2(20);
		//multiple.setResult(multiple.getNum1() + multiple.getNum2());
		System.out.println(multi.multiple());

		
		
		divi.setNum1(10);
		divi.setNum2(20);
		//divide.setResult(divide.getNum1() + divide.getNum2());
		System.out.println(divi.divide());

		//객체마다 인스턴스를 만들어줘야 한다.
		
		
		

	}

}
