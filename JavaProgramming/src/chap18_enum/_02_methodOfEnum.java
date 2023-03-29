package chap18_enum;

import chap18_enum.enums.MethodMonth_KHH;

public class _02_methodOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodMonth_KHH.printMonth(5); //monthArr을 순회하면서 같은 달을 찾아서 출력해줍니다.
		
		MethodMonth_KHH aug = MethodMonth_KHH.AUG;
		aug.printAddMonth(3);
		

	}

}
