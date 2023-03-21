package chap11_interface.multiinherit;

public interface Stadium {//경기장

	// 인터페이스는 변수 거의 안씀. 기능만 선언함.
	void getSportsSchedule(int month);
	int getSportsTicketPrice(int people);
	void getSupportersItem(int people);
}
