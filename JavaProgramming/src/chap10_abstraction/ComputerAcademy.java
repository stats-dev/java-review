package chap10_abstraction;

public class ComputerAcademy extends Academy {

	// Academy에 있는 추상 메소드를 모두 가져올 수 있습니다!!! 다 안가져오면 문제가 됩니다.
	//어노테이션 기법 @~~~ 골뱅이
	//이게 있으면 그냥 오버라이드 된다고 컴파일러에게 알려줍니다.
	//부모랑 비교 안하고 바로 진행된다.
	//@Override : 오버라이드된 메소드라고 컴파일러에게 알림
	//@Override 없으면 컴파일러가 오버라이드된 메소드인지
	//부모와 자식을 계속 비교하면서 컴파일함.
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원에서 프로그래밍을 가르치다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원에서 프로그래밍 과제를 수행한다.");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원에서 쉬는 시간에는 쉰다.");
		
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원에 출석하다.");
		
	}

}
