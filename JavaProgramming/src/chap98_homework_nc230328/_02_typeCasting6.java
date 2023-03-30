package chap98_homework_nc230328;

import java.util.Scanner;

public class _02_typeCasting6 {

	public static void main(String[] args) {
//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 문자를 입력하세요.");
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		
		System.out.println(ch1 + "의 유니코드 : " + (int) ch1);
		System.out.println(ch2 + "의 유니코드 : " + (int) ch2);
		
		sc.close();

	}

}
