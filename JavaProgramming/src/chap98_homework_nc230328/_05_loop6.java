package chap98_homework_nc230328;

import java.util.Scanner;

public class _05_loop6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.

		System.out.println("문자열을 입력하세요.");
		String str6 = sc.next();
		for(int i = str6.length(); i > 0; i--) {
			System.out.println(str6.charAt(i-1));
		}
		sc.close();

	}

}
