package chap11_interface.device;

public interface ElectronicDevice {
	void powerOn();
	void powerOff();
	
	//이 default 키워드로 상속받은 친구들까지 다 들어갈 수 있다.
	default void reset() {
		System.out.println("장치를 리셋합니다.");
	}
	
	//static은 오직 이 선언된 인터페이스를 직접 가져와야 사용이 가능하다.
	public static void warn() {
		System.out.println("알람을 울리다.");
	}
}
