package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator1 {

	public static void main(String[] args) {
		
//		1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b != 0) {
			System.out.printf("덧셈: %d, 뺄셈: %d, 곱셈: %d, 나눗셈: %.2f, 나머지: %d", 
					(a+b),(a-b),(a*b),((double) a/b),(a%b));
		} else {
			System.out.println("나눗셈은 분모에 0이 들어갈 수 없습니다.");
		}
		
		sc.close();

	}

}
