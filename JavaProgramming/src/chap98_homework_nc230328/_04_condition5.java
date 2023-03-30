package chap98_homework_nc230328;

import java.util.Scanner;

public class _04_condition5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);

		int a5 = sc.nextInt();
		if(a5 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		sc.close();


	}

}
