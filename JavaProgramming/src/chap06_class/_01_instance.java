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
		Minus minus = new Minus();
		Multiple muliple = new Multiple();
		Divide divide = new Divide();
		
		// public 이니 어디서든 이 멤버변수 접근 가능하다!
//		add.num1 = 10;
//		add.num2 = 20; 
//		add.result = add.num1 + add.num2;
		
		
		// private 이면 안되므로 이때 필요한게 getter setter.
		// 보안을 위해서 private 권장 + setter, getter 가져와서 진행하면 됩니다.
		add.setNum1(10);
		add.setNum2(20);
		add.setResult(add.getNum1() + add.getNum2());
		
		

	}

}
