package chap18_enum;

import chap18_enum.enums.DefaultMonth;

public class _02_withDefaultEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaultMonth 형의 변수 선언
		// DefaultMonth.JAN을 값으로 갖는 DefaultMonth의 열거형 객체가 하나 생성.
		DefaultMonth jan = DefaultMonth.JAN;
		
		//DefaultMonth의 열거형 객체의 이름 (상수의 이름)
		//=> JAN (이렇게 출력됨)
		System.out.println(jan);
		// ordinal() => 해당 상수의 인덱스
		System.out.println(jan.ordinal()); //인덱스 뽑아내는 .ordinal() 사용
		//DefaultMonth의 열거형 객체의 이름 (상수의 이름)
		//=> AUG 
		System.out.println(DefaultMonth.AUG); // (출력하고 나서는 바로 삭제됨)

	}

}
