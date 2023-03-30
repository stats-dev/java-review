package chap98_homework_nc230328;

import java.util.Scanner;

public class _06_array3 {

	public static void main(String[] args) {
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int[] iArr = new int[10];
		int sum = 0;
		System.out.println("10개의 정수를 입력하세요.");
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		
		System.out.printf("평균은 %.2f 입니다.", (double) sum / iArr.length);
		
		sc.close();
	}

}
