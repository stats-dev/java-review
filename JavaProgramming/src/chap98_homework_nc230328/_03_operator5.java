package chap98_homework_nc230328;

import java.util.Scanner;

public class _03_operator5 {

	public static void main(String[] args) {

//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		

		System.out.println("정수를 입력해주세요.");
		int num5 = sc.nextInt();
		
		String result = (num5 % 2 == 0) ? "짝수" : "홀수"; 
		
		System.out.println(result);

		sc.close();

	}

}
