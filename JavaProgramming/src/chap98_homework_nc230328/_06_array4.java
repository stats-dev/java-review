package chap98_homework_nc230328;

import java.util.Scanner;

public class _06_array4 {

	public static void main(String[] args) {
//		*4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
		int[] iArr = new int[100];

		int sum = 0;
		for(int i = 0; i < 100; i++) {
			if((i+1) % 2 == 0) {
				iArr[i] = i+1;
				sum += iArr[i];
			}
		}
		
//		for(int i = 0 ; i < iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
		
		System.out.println(sum);
		
		
	}

}
