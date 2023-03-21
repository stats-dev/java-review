package chap98_homework_nc230321.calc;

public class Calculator {
	
	//인스턴스 중첩 클래스
	/*
	 * 1. Calculator 클래스를 만들고 인스턴스 중첩 클래스로 Add, Sub, Mul, Div 클래스를 만드세요. 각각 int
	 * add(int a, int b) int sub(int a, int b) int mul(int a, int b) int div(int a,
	 * int b) 메소드를 가진 인스턴스 중첩 클래스를 구현하시면 됩니다.
	 */	
	public class Add {
		int a;
		int b;
		
		int result = a + b;
		
		// getter and setter 넣어줍니다!!
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		
				
		
	}
	
	public class Sub {
		int a;
		int b;
		
		int result = a - b;
		
		// getter and setter 넣어줍니다!!
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		
		
	}
	
	public class Mul {
		int a;
		int b;
		
		int result = a * b;
		
		// getter and setter 넣어줍니다!!
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		
		
		
	}
	
	public class Div {
		int a;
		int b = 1; // 0 아니게 만든다.
		
		
		int result = a / b;
		
		// getter and setter 넣어줍니다!!
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			if (b != 0)
				return b;
			return b;
		}
		public void setB(int b) {
			this.b = b;	
			
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		
		
		
	}

}
