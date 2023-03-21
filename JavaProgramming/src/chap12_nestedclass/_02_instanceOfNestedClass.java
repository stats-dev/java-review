package chap12_nestedclass;

import chap12_nestedclass.clazz.NestedClass;

public class _02_instanceOfNestedClass {

	public static void main(String[] args) {

		//외부 클래스(NestedClass)의 객체(nc) 인스턴스화된 객체로 생성
		NestedClass nc = new NestedClass();
		
		//1. 인스턴스 중첩 클래스의 객체 생성 (nc에 담긴 객체 이용해서 생성자를 new Mul()로 호출한다. 멤버처럼 nc를 사용한다.)
		NestedClass.Mul mul = nc.new Mul(); // nc 객체를 통해 생성자를 (mul?)을 다시 호출한다.
		//nc.aaa; nc의 멤버처럼 사용해야함.
		
		//2. 정적 중첩 클래스의 객체 생성
		NestedClass.Div div = new NestedClass.Div(); // nc라는 외부 클래스 객체 nc 없이도 그냥 만들 수 있당.
		// 즉 메모리에 올라가 있으니 바로 사용이 가능하다. 정적임.
		
		//3-1. 정적 중첩 클래스의 정적 멤버에 접근, 특히 static한 멤버가 바로 접근 가능!!
		System.out.println(NestedClass.Div.result); // 이렇게도 가능. 닷닷닷!
		// class 선언된 result만 Div에서 나타납니다.		
		
		//3-2. 정적 중첩 클래스의 일반 멤버에 접근, 일반은 무조건 만들어진 객체를 거쳐서 접근할 수 있음!!
		System.out.println(div.getNum3());
		
		
		//4. 인스턴스 중첩 클래스의 객체
		mul.setNum1(150); // 객체를 이용해서 하나씩 접근할 수 있게 됩니다.
		mul.setNum2(15);
		mul.setResult(mul.getNum1() * mul.getNum2());
		System.out.println(mul.getResult());

	}

}
