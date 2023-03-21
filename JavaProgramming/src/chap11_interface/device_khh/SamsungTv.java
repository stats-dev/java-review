package chap11_interface.device_khh;

public class SamsungTv implements ElectronicDevice {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("삼성 디스플레이가 방송을 선명하게 보여준다.");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV는 소리가 경쾌하다.");
		
	}

	@Override
	public int changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println(channel + "번 채널로 변경합니다.");
		return channel;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV 전원이 꺼졌습니다.");
		
	}
	

}
