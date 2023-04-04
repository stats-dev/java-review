package chap20_lambda;

import chap20_lambda.clazz.MulAndDiv;

public class _03_paramLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulAndDiv mad = new MulAndDiv();
		
		//매개변수 한줄이면 이렇게 매개변수 괄호가 생략됩니다.
		mad.action1(a -> System.out.println(a * a));
		
		
		//두줄 이상이면, 이렇게 중괄호를 활용해볼 수 있습니다.
		mad.action2((a, b) -> {
		System.out.println(a / b);
		System.out.println((a * a) / (b * b));
		});
			

	}

}
