package chap98_homework_nc230328;

import java.util.Scanner;

public class _02_typeCasting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 한 개를 입력하세요.");
		double num;
		num = sc.nextDouble();
		System.out.println((int) num);

		sc.close();

	}

}
