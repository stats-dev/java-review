package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Minus;

public class _02_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cal = new Calc(); // 부모 객체 하나 선언
		Add add = new Add();
		Minus min = new Minus();
		
		System.out.println(cal.add(4, 3));
		System.out.println(cal.minus(4, 3));
		System.out.println("-----------------");
		System.out.println(add.add(4,3)); // 부모에는 있지만 오버라이딩된 부분으로 재정의해서 전혀 다른 결과가 나온다. (자식객체 기준)
		System.out.println(min.minus(4, 3)); // 이렇게 쓰면 부모에 있는 .minus 가 동작하게 된다.
		
		// 다형성 일어남. 똑같은 클래스/메소드/객체?로 다른 결과값을 보여줄 수 있음..
		// 상속과 다형성? 보기..
		
		
		
		

	}

}
