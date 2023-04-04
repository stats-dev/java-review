package chap20_lambda;

import chap20_lambda.clazz.CompareStr;

public class _07_lambdaEx_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(String :: equals);

	}
	
	public static void action(CompareStr cstr) {
		boolean result = cstr.compareTwoStr("bit","bit1");
//		boolean result1 = cstr.compareTwoStr("bit","bit");
		
		
		System.out.println(result ? "두 문자는 같습니다" : "두 문자는 다릅니다.");
//		System.out.println(result1 ? "두 문자는 같습니다" : "두 문자는 다릅니다.");
	}

}
