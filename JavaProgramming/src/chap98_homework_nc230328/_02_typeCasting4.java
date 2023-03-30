package chap98_homework_nc230328;

import java.util.Scanner;

public class _02_typeCasting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 한 개를 입력하세요.");
		double numD;
		numD = sc.nextDouble();
		double result = numD * numD;
		System.out.println(String.valueOf(result));
		System.out.println("" + result);
		
		sc.close();

	}

}
