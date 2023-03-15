package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 관계연산자
		// 두 수의 크기를 비교하거나 두 수의 동일여부 판단
		int num1 = 110;
		int num2 = 215;
		
		System.out.println("num1 < num2 : " + (num1 < num2)); // true

		System.out.println("num1 >= num2 : " + (num1 >= num2)); // false
		
		System.out.println("num1 == num2: " + (num1 == num2)); // false
		
		
		//번외 String은 값의 동일여부를 판단할 때 == 사용하지 않습니다.
		//==을 사용하면 같은 값인지 비교하는 게 아니고
		//같은 객체를 참조하고 있는지 비교
		//값의 동일여부를 비교하려면 .equals() 메소드 사용
		String str1 = new String("hello"); // 객체를 따로 만들기 위함.
		String str2 = new String("hello"); //str2도 str1에서 만든 hello를 그냥 참조하게 되어 new String으로 새로 만들어야 정확히 비교 가능함.
		
		//같은 객체를 참조하는지
		System.out.println(str1 == str2); // 객체가 따로 생성되어 참조되는 게 달라진다.
		 
		
		//값의 동일여부 비교
		System.out.println(str1.equals(str2)); // true, 참조변수의 값만 비교하고 싶다면 이렇게 .equals()를 써줍시다.
		
		//2. 논리연산자 (&&, ||, !)
		int num3 = 10;
		int num4 = 33;
		
		System.out.println("num1 < num2 && "
				+ "num3 / num4 == 0 => " + 
				(num1 < num2 && num3 / num4 == 0)); // 둘다 true -> true
		
		System.out.println("false || " //왼족 항 자체를 false 로 지정하고 시작할 수도 있다!!!
				+ "num3 < 100 => " + 
				(false || num2 < 100)); // false 이고 false 이므로 false
		
		System.out.println("!(num4 > 2000) => "
				+ !(num4 > 2000)); // !false => true  
		
		
	}

}
