package chap98_homework_nc230328;

import java.util.Scanner;

public class _02_typeCasting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세오.");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b != 0) {
			System.out.println((double)a / b);
		} else {
			System.out.println("b는 0을 입력할 수 없습니다.");
		}
		

		
		sc.close();

	}

}
