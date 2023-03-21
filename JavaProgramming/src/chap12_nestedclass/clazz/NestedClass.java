package chap12_nestedclass.clazz;
			// 외부 클래스
public class NestedClass {
	//public int aaa = 10;
	//인스턴스 중첩 클래스(내부 클래스)
	//외부클래스의 객체를 생성한 다음에나/후에 접근 가능
	public class Mul {
		//static 변수나 메소드는 선언 불가하다.
		//final static 변수나 메소드는 상수라서 가능 (선언 가능)
		//내부 변수도 public 아니면 접근이 불가능하다.
		int num1 = 100; // public으로 안하는 경우를 상정한다.
		int num2 = 2;
		
		int result = num1 * num2;
		
		//alt + shift +s -> generate getter and setter;
		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
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
		
		

		
	}
	
	
	//정적 중첩 클래스
	//외부클래스의 객체 생성 없이도 접근 가능
	public static class Div {
		//static 변수나 메소드를 선언 가능하다.
		int num3 = 10;
		int num4 = 5;
		
		//위에는 객체 접근이 안됩니다.
//		public static int result = num3 / num4; // 이러면 result가 먼저나왔는데 새로 지정하면서 에러남.
		public static int result = 10 / 5;

		public int getNum3() {
			return num3;
		}

		public void setNum3(int num3) {
			this.num3 = num3;
		}

		public int getNum4() {
			return num4;
		}

		public void setNum4(int num4) {
			this.num4 = num4;
		} 
		
	}
	
}
