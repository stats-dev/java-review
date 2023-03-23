package chap98_homework_nc230323;

import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용필수).
		
//		Scanner sc = new Scanner(System.in);
//		
////		StringBuffer[] input = new StringBuffer[3];
////		for(int i=0;i<input.length;i++) {
////		input[i] = sc.next();
////	}
//		System.out.println("문자열 3개를 입력하세요.");
//
//		StringBuffer input1 = new StringBuffer(sc.next());
//		StringBuffer input2 = new StringBuffer(sc.next());
//		StringBuffer input3 = new StringBuffer(sc.next());
//		
//		String inputString1 = input1.toString();
//		String inputString2 = input2.toString();
//		String inputString3 = input3.toString();
//		
//		
//		String result1 = inputString1.concat(inputString2);
//		String result2 = inputString3.concat(result1);
//		
//		System.out.println(result2);
//		
		
		
		//2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");

		sb.setLength(30);

		for(int i=5;i<=30;i++) {
			sb.insert(i, "a");
		}
		System.out.println(sb.toString());
	

		

		//3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
		double num = 16.459;
		
		// 소수점 두자리까지 지정하고 싶다면? 반환타입이 long임에 유의하라!
		System.out.println((double)Math.round(num * 100) / 100); //이러면 소수점 두자리 되겠지?

		

//4. 문자열 "145.987", "-563.11" 을 double형으로 변경하여
//     덧셈의 결과를 출력하세요.
		
		double result =	Double.parseDouble("145.987") + Double.parseDouble("-563.11");
		System.out.println(result); 
		
		

		

	}

}
