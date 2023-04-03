package chap98_homework_nc230403;

import java.util.Scanner;

public class _02_typeCastings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------형변환--------------------
//		1. 사용자가 입력한 수(실수나 정수 모두 가능)를 
//		StringBuilder로 받아서 점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.
		System.out.println("수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		

		if(sb.toString().contains(".")) {
			System.out.println(Double.valueOf(sb.toString()));
		} else {
			System.out.println(Integer.valueOf(sb.toString()));
		}


		sc.close();
		

	}

}
