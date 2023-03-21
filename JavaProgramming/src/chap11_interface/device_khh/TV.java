package chap11_interface.device_khh;

public interface TV extends Display, Speaker {
	int changeChannel(int channel);

}
