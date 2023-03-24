package chap98_homework_nc230323;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		StringBuffer input = new StringBuffer(30);
		input.append("hello");
//		input.setLength(30);
		
		int len = input.capacity() - input.length();

//		System.out.println(input.length()-2);;
//		System.out.println(input.length());
		for(int i=5;i<len;i+=3) {
//			System.out.println(i);
			input.insert(i, "b");
			input.insert(i+1, "i");
			input.insert(i+2, "t");
		}
		
		System.out.println(input.toString());
//		System.out.println(input.capacity());

		
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
//	     사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.
		
		StringBuffer input1 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		
		//사용자 정수 입력
		Scanner sc = new Scanner(System.in);
		int input_int = sc.nextInt();
		
		
		//거꾸로 문자열
		input1 = input1.reverse(); // 
		
		//해당 정수를 인덱스로 했을때 문자 출력
		System.out.println(input1.charAt(input_int));
		
		
		
//		3. 처음에 은행에 맡긴 돈은 10000원입니다
//		   금리는 연 10%입니다
//		   복리이자로 계산했을 때 10년후 얼마가 될까요?
		
		
		int money = 10000;
		double rate = 1.1;

		int year = 10;
		
		double result = money * (Math.pow(rate,year));
		
						
		System.out.println(result);
		
		

//		4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
		
//		static BigInteger factorial(BigInteger n) { // 매개변수로 BigInteger를 받는 멋진 함수이다.
//			if(n.intValue() == 0) {
//				return BigInteger.ONE;
//			} else {
//				//재귀메소드(함수) : 메소드안에서 해당 메소드 다시 호출
//				return n.multiply(factorial(n.subtract(BigInteger.ONE)));
//			}
//			
//		}
		
	
		
	}

}
