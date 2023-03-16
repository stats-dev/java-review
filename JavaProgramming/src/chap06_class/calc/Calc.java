package chap06_class.calc;

public class Calc { // 기능이 4개인 클래스(설계도)가 생겼다..
	public int num1;
	public int num2;
	public int result;
	
	//이 클래스는 메인 함수가 있는 클래스 내 생성자 함수를 통해 실행이 가능하며, 이 생성자 함수로 호출되면 heap 메모리에 올라가고, 다시 그 변수로 들어가게 됩니다.
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multi(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	

}
