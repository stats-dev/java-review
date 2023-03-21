package chap11_interface.buildings;

public interface Building {
	// 모든 변수는 자동으로 상수화됨.
	//	String price; // 상수는 값을 지정하지 않으면 에러가 납니다!
	String price = "expensive";
	int floors = 120;
	
	
	//메소드는 자동으로 추상화됨
	void build(); 
	void turnOnAircon(); // 에어컨
	int getParkingPrice(int time); //주차비
	
	
}
