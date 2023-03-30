package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------연산자--------------------
//
//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0 && num1 % 7 == 0) {
			System.out.println("2와 7의 공배수");
		} else {
			System.out.println("2와 7의 공배수가 아님");
		}
		
		sc.close();

	}
	
}
