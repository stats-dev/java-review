package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("문자(char) 연산자를 입력하세요.");
		char op = sc.next().charAt(0);

		
		switch (op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			if(b != 0) {
				System.out.println(a/b);				
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			break;
		default:
			break;
		}

		sc.close();
	    
	}
	
	

}
