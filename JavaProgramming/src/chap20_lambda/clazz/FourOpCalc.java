package chap20_lambda.clazz;


//사칙연산 계산기 클래스
public class FourOpCalc {
	public int calc(int a, int b, char op, FourOperation fo) {
		int result = fo.operate(a, b);
		return result;
	}
	
	

}
