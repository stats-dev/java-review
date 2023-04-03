package chap98_homework_nc230403;

import java.util.Scanner;

public class _01_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------변수--------------------
//		1. 두 개의 정수 a = 10; b = 3;으로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(나눗셈의 결과는 double형으로 나머지는 int형으로 출력)
//
		int a = 10;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double) a / b);
		
//		2. 두 개의 실수 num1 = 10.01; num2 = 12.25;로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(네 연산 모두 double형 출력)
		double num1 = 10.01;
		double num2 = 12.25;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
//		3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String prstr = "";
		for(int i =0;i<input.length();i++) {
			char ch = input.charAt(i);
			char converch = 0;
			
			if(ch >= 'A' && ch <= 'Z') {
				converch = (char)(ch + 32);							
			} else if (ch >= 'a' && ch <= 'z') {
				converch = (char)(ch - 32);
			}
			prstr += converch;
//			System.out.println(converch);
		}

		System.out.println(prstr);

		
		sc.close();


	}

}
