package chap98_homework_nc230328;

import java.util.Scanner;

public class _02_typeCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");
		String num1, num2;
		num1 = sc.next();
		num2 = sc.next();
		
		System.out.println(Integer.valueOf(num1) + Integer.valueOf(num2));
		
		sc.close();

	}

}
