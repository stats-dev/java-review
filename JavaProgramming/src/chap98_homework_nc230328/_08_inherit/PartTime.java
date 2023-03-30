package chap98_homework_nc230328._08_inherit;

public class PartTime {
	public int workTime;
	public int pay;
	
	//2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다
	//(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
	public void printWorkPay() {
		System.out.printf("%d시간 동안 일해서 %d원 급여를 받는다. \n", workTime, workTime * pay);
	}

}
