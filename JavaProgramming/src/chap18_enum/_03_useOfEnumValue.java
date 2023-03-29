package chap18_enum;

import chap18_enum.enums.ValueMonth;

public class _03_useOfEnumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum의 객체를 만들 때 생성자가 자동으로 호출
		//호출한 상수 값이 생성자의 매개변수로 들어가서
		//선언되어 있는 변수에 대입된다.
		ValueMonth mar = ValueMonth.MAR;
		
		
		System.out.println(mar.getMonthVal()); // 꺼내오는 getter 메소드로 출력하거나 사용할 수 있게 된다.
		
		//여러형태의 enum 객체 생성
		ValueMonth jan = ValueMonth.JAN;
		ValueMonth feb = ValueMonth.valueOf("FEB"); //valueOf로 객체 만드는게 다 동일.
		ValueMonth apr = ValueMonth.valueOf(ValueMonth.class, "APR"); //클래스를 직접 넣어서 꺼내올 수 있음..
		
		System.out.println("jan : " + jan);
		System.out.println("feb : " + feb);
		System.out.println("apr : " + apr);
		
		
		//enum 객체 배열
		ValueMonth[] vmArr = ValueMonth.values(); //이러면 바로 array로 만들 수 있음.
		for(ValueMonth v : vmArr) {
			System.out.println(v.name() + "은 " + v.ordinal() + "인덱스에 있습니다.");
		}
		
		
//		RGB red = RGB.RED;
//		
//		System.out.println(red.getColor());
//		
		
	}

}
