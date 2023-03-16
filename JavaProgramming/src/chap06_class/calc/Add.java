package chap06_class.calc;

public class Add extends Calc {
	//멤버 변수
	private int num1;
	private int num2;
	private int result; // 같은 접근?
	//public : 어디서든 객체화할 수 있다.
	
	//@Override <-> 오버라이드를 넣으면? 내가 오버라이드 한다고 자바 컴파일러에게 전달하여 체크 가능함. 
	
	// alt + shift + s -> Generate Getters and Setters > select all
	// select all 하면 만들 수 있음.
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1; //this는 현재 값이다. 그 인스턴스값 num 1 이 각각 instance로서 제공한 값으로 활용된다.
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	// 메소드 만들기
	public int add() {
		result = num1 + num2;
		return result; //반환될 타입, 인트형의 변수 값 입력
	}
	
	
	//오버라이딩 : 부모클래스에 존재하는 메소드를 재정의
	public int add(int a,int b) {
		return (a * a ) + (b * b);
	}


	
	
	
	
	

}
