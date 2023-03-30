package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.

		System.out.println("정수를 입력하세요.");
		int a2 = sc.nextInt();
		
		if(a2 > 0) {
			System.out.println("양수");
		} else if (a2 < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0 입니다.");
		}
		
		sc.close();


	}

}
