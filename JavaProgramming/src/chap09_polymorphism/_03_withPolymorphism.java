package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 이용해 Tv 바꾸기
		//Tv tv = new LgTv(); //한번에 바꿀 수 있음. 
		
		Tv tv = new SamsungTv(); //한번에 바꿀 수 있음. 
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();

		//다형성 관점: Object 클래스는 모든 클래스를 생성자로 쓸 수 있다.
		Object o = new LgTv();
		o = new SamsungTv();
		o = new Tv();
		
		//Map<key, value>
		//Map<company: {["현대", "기아", "쉐보레"]}
		//Map<String, Object> <- 엄청난 확장성이 나타난다. 이 Obejct 자리에 아무거나 들어갈 수 있기 대문임.
		
		//collection배울 때, 키로 구한다. {company: "현대"}
		
		
		System.out.println(tv.toString());

	}

}
