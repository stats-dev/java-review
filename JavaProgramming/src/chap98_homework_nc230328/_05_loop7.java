package chap98_homework_nc230328;

import java.util.Scanner;

public class _05_loop7 {

	public static void main(String[] args) {
		
//		** 이해가 잘 안됩.
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 정수를 입력하세요.");
		int a7 = sc.nextInt();
		int b7 = sc.nextInt();
	
		int gcd = gcd(a7, b7);
		int lcm = (a7 * b7) / gcd;
		
		System.out.println("최소공배수 : " + lcm + "최대공약수 : " + gcd);
		sc.close();

	}
	
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int remain = a % b;
			a = b;
			b = remain;
		}
		return a;
	}

}
