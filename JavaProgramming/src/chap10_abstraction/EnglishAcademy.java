package chap10_abstraction;

public class EnglishAcademy extends Academy{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 알파벳을 가르치다.");
		
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 숙제를 한다.");
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 쉬는시간에 쉰다.");
		
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 출석하다.");
		
	}

}
