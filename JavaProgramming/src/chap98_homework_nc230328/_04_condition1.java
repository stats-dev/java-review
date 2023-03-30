package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//--------------------조건문--------------------
//1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		System.out.println("정수 두개를 입력하세요.");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		
		if(a1 > b1) {
			System.out.println(a1);
		} else if (a1 < b1) {
			System.out.println(b1);
		} else {
			System.out.println("두 정수는 같습니다.");
		}

		sc.close();


	}

}
