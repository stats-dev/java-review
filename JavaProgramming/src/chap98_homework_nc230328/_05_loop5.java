package chap98_homework_nc230328;

import java.util.Scanner;

public class _05_loop5 {

	public static void main(String[] args) {
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력하세요.");
		
		int[] iArr5 = new int[10];
		for(int i = 0; i < iArr5.length; i++ ) {
			iArr5[i] = sc.nextInt();
		}
		
		for(int i = 0; i < iArr5.length; i++ ) {
			System.out.println(iArr5[iArr5.length - i - 1]);

		}
		sc.close();
		
	}

}
