package chap15_usefulClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _17_bigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigDecimal 객체 생성
		BigDecimal bd1 = new BigDecimal(1.732);
		BigDecimal bd2 = BigDecimal.valueOf(3.14);
		BigDecimal bd3 = new BigDecimal(12.111222333);
		
		
		//반올림 모드
		//divide : 나눌 때 오차가 발생할 수 있으므로 반올림모드를 지정
		//MathContext(int precision) => precision은 
		//연산에 사용할 총 자리수, 정수의 자리수도 포함.
		System.out.println(bd2.divide(bd1, new MathContext(4, RoundingMode.CEILING))); // 소수점이 아니라 전체 자리 ex) 1.813 네개 숫자로 표현하겠다!
		
		//setScale : 소수점 자리수를 다시 설정
		//.145 소수점 3자리에서 .14500 5자리로 변경
		System.out.println(bd2.setScale(5, RoundingMode.FLOOR)); // 이번에는 5자리까지 버림으로 처리 표현하겠다!
		
		//.732 자리에서 .7320 소수점 4자리로 변경
		System.out.println(bd1.setScale(4, RoundingMode.UP));

		//.111222333 9자리에서 3자리로 변경하는데 양수면 올림 음수면 버림?
		System.out.println(bd3.setScale(3, RoundingMode.UP));
		System.out.println(bd3.setScale(3, RoundingMode.DOWN));
		
		
		
		

	}

}
