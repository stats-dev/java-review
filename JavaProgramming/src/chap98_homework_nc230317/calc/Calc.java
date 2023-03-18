package chap98_homework_nc230317.calc;

public class Calc {
	public int a;
	public int b;	
	public int result;
	
	public void setValue(int a, int b) {
		
		this.a = a;
		this.b = b;

	}
	
	public int calculate() {
		
		return result;
		
	}
	

}

//Add, Sub, Mul, Div모두 공통된 필드와 메서드가 존재하므로
//Calc를 정의하고 이들이 Calc를 상속받게 하세요
//그리고 Calc의 배열에 자식 객체들을 담고
//calculate를 실행시키세요