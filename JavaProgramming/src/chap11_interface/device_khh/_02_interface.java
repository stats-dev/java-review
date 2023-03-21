package chap11_interface.device_khh;

public class _02_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicDevice dev = new LgTv();
		
		dev.powerOn();
		dev.show();
		dev.sound();
		dev.changeChannel(10);
		dev.powerOff();
		
		dev = new SamsungTv();
		
		dev.powerOn();
		dev.show();
		dev.sound();
		dev.changeChannel(15);
		dev.powerOff();



	}

}
