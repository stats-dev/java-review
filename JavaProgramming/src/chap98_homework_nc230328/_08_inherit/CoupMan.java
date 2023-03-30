package chap98_homework_nc230328._08_inherit;

public class CoupMan extends PartTime {
//	알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다
//	메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
	public void printWorkPay() {
		System.out.printf("쿠팡맨은 일한 시간 %d 시간동안 배송해서 %d 시간 * %d 원에 해당하는 %d원을 급여로 받는다. \n", 
				workTime, workTime, pay , workTime * pay);
	}
	
	
	
}
