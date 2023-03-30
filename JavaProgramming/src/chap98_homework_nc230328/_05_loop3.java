package chap98_homework_nc230328;

import java.util.Scanner;

public class _05_loop3 {

	public static void main(String[] args) {
//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요.");
		int num3 = sc.nextInt();
				
		
		for(int i = 2; i <=num3 ; i++) {
			//플래그를 사용해서 빠르게 처리할 수 있다.
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(num3); j++) { //왜 제곱근인지는 모르겠음.
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}					
			if(isPrime) {
				System.out.println(i + " ");
			}
		}
		sc.close();

	}
}
