package chap11_interface;

import chap11_interface.device.ElectronicDevice;
import chap11_interface.device.LgTv;
import chap11_interface.device.Tv;

public class _01_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.show();
		tv.sound();
		tv.reset(); // 이걸 부모에서만 추가하면 되고 자식객체 수정 안해도 된다. 그러니 매우 쉽다.
		
		//static 메소드를 사용하려면
		//static 메소드가 선언된 클래스를
		//사용해서 호출한다.
		ElectronicDevice.warn();
		
		//static 메소드는 상속받은 자식클래스에서
		//호출은 불가능하다.
		//Tv.warn(); // 상속받은 클래스에서는 못사용함. static이므로! 
		//Display.warn();

	}

}
