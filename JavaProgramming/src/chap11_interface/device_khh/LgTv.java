package chap11_interface.device_khh;

public class LgTv implements ElectronicDevice {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("LG 디스플레이가 방송을 선명하게 보여준다.");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("LG TV는 소리도 맑고 깨끗하다.");
		
	}

	@Override
	public int changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println(channel + "채널로 변경합니다.");
		return channel;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 전원이 꺼졌습니다.");
		
	}

}
