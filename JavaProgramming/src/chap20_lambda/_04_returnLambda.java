package chap20_lambda;

import chap20_lambda.clazz.CustomString;
import chap20_lambda.clazz.CustomString2;

public class _04_returnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action((a, b) -> {
			String returnStr = b.concat(a); //b에다가 a를 붙여버린다. 
			return returnStr;
		});
		
		// 중괄호가 없을 때는 return 구문 사용 불가
		action2((a,b,c) -> (a + b).indexOf(c));

		//		action2((a,b,c) -> {
//			String str = a + b;
//			int index = 0;
//			for(int i = 0; i < str.length(); i++)
//				if(c == str.charAt(i)) {
//					index = i;
//				}
//			return index;
//		});

//		action2((a,b,c) -> a.concat(b).indexOf(c));

	}
	
	public static void action(CustomString cs) { //main 메소드 같이 있으면 static으로 만들어줘야 한다.
		String resultStr = cs.concat("bit", "naver");
		
		System.out.println(resultStr);
	}

	public static void action2(CustomString2 cs) {
		int index = cs.indexOf("google", "microsoft", 'f');
		
		System.out.println(index);
	}
}
