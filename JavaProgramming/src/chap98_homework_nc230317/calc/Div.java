package chap98_homework_nc230317.calc;

public class Div extends Calc {
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		
		this.a = a;
		this.b = b;

	}
	
	public int calculate() {
		
		result = a / b;
		
		return result;
		
	}
}
