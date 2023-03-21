package chap11_interface.multiinherit;

public class _02_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiflexStadium ms = new SeoulMultiflexStadium(); // 추상클래스 주의
		//Stadium ms = new SeoulMultiflexStadium(); // 추상클래스 주의 이렇게 되면 경기장내 메소드만 쓸 수 있다.
		
		ms.getSportsSchedule(3);
		int sportsTicket = ms.getTicketPrice(2);
		ms.getSupportersItem(2);
		ms.getRemainSeat();
		int concertTicket = ms.getTicketPrice(5);
		
		ms.playSportsAndConcert();
		
	}

}
