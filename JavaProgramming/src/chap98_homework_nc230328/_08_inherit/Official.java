package chap98_homework_nc230328._08_inherit;

public class Official implements Worker {

	@Override
	public void go(int goTime) {
		// TODO Auto-generated method stub
		System.out.printf("공무원은 %d시에 출근한다.\n", goTime);
		
	}

	@Override
	public void leave(int leaveTime) {
		// TODO Auto-generated method stub
		System.out.printf("공무원은 %d시에 퇴근한다.\n", leaveTime);
		
	}

	@Override
	public void work(int workTime) {
		// TODO Auto-generated method stub
		System.out.printf("공무원은 %d시간 일한다.\n", workTime);

		
	}

}
