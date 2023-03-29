package chap18_enum;

import chap18_enum.enums.MethodMonth_KHH;

public class _05_methodOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodMonth_KHH.printMonth(5);
		
		MethodMonth_KHH aug = MethodMonth_KHH.AUG;
		aug.printAddMonth(3);
		aug.printAddMonth(100);
	}

}
