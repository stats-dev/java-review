package chap98_homework_nc230315;

public class _01_basic_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.");
		// 1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 
		// 출력된 값은 모두 증감연산자가 포함된 상태입니다.
		int num = 10;
		
		
		
		System.out.println(++num);//	    11
		System.out.println(++num);//	    12
		System.out.println(num--);//	    12
		System.out.println(--num);//	    10
		System.out.println(num--);//	    10
		System.out.println(--num);//	     8
		
		
		
		// 2. 2. 관계연산자(<, >) 두 개를 사용하여
		// int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
		
		System.out.println("------------------------");
		System.out.println("2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.");
		int a = 10;
		int b = 20;
		System.out.println(a < b);
		System.out.println(a > b);
		

	}

}
