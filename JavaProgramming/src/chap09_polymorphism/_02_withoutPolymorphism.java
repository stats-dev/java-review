package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;

public class _02_withoutPolymorphism {
	public static void main(String[] args) {
		//1. 다형성을 사용하지 않고 Tv 바꾸기
		LgTv lgtv = new LgTv();
		SamsungTv stv = new SamsungTv();
		
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		lgtv.powerOn();
		
		// 다 바꿔줘서 하나씩 명령실행;
		
		stv.powerOn();
		stv.operate(13);
		stv.powerOff();
		stv.powerOn();
		
		
		
	}
}
