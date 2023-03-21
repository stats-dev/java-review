package chap10_abstraction.product;

public class SamsungTv extends Tv {
	public void powerOn() { // 부모클래스에서 정의만하고, 자식클래스에서 선언한다.
		System.out.println("samsungTv 전원 켜기");
	}
	
	public void powerOff() {
		System.out.println("samsungTv 전원 끄기");
	}
	
	public void operate(int channel) {
		
		super.operate(channel);
	}
}


