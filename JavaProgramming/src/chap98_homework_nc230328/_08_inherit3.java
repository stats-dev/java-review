package chap98_homework_nc230328;

import chap98_homework_nc230328._08_inherit.Develper;
import chap98_homework_nc230328._08_inherit.Official;
import chap98_homework_nc230328._08_inherit.Worker;

public class _08_inherit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//3. 근로자를 인터페이스로 생성하고 출근하다(go), 퇴근하다(leave), 일한다.(work) 메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를 
//    본인이 원하는 대로 구현하세요.
		Worker dv = new Develper(); //타입만 인터페이스로 받는듯 하다.
		dv.go(10);
		dv.leave(20);
		dv.work(10);
		
		dv = new Official();
		dv.go(9);
		dv.leave(17);
		dv.work(8);



	}

}
