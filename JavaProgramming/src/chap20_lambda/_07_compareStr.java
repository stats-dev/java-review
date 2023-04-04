package chap20_lambda;

import chap20_lambda.clazz.UseOfCompareStr;

public class _07_compareStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfCompareStr uocs = new UseOfCompareStr();
		
//		uocs.judgeEquals((a, b) -> a.equals(b)); //타입이 String 형태여서 아래처럼 사용.
		uocs.judgeEquals(String :: equals); //이게 원래 위와 같음.

	} 

}
