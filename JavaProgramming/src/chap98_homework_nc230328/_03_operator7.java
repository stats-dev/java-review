package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------연산자--------------------
//
		
//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("두개의 실수를 입력하세요.");
		double num7a = sc.nextDouble(); 
		double num7b = sc.nextDouble();
		if(num7b != 0) {
			System.out.printf("두 실수의 덧셈 : %.3f, 뺄셈 : %.3f, 곱셈 : %.3f, 나눗셈 : %.3f, 나머지 : %.3f", 
					num7a + num7b, num7a - num7b, num7a * num7b, num7a / num7b, num7a % num7b);			
		} else {
			System.out.println("분모에 0이 들어갈 수 없습니다.");
		}

		sc.close();

	}

}
