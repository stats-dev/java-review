package chap98_homework_nc230328;

import java.util.Random;

public class _06_array7 {

	public static void main(String[] args) {
		
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
		int[] iArr1 = new int[4];
		int[] iArr2 = new int[3];
		int[] iArr_sum = new int[7];
		
		Random rand = new Random();
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = (rand.nextInt(100) + 1);
		}
		

		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (rand.nextInt(100) + 1);
		}
//		
//		for(int i = 0; i < iArr1.length; i++) {
//			System.out.println(iArr1[i]);
//		}
//		System.out.println("----------");
//		for(int i = 0; i < iArr2.length; i++) {
//			System.out.println(iArr2[i]);
//		}
//		System.out.println("----------");
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr_sum[i] = iArr1[i];
			for(int j= iArr1.length; j < iArr_sum.length; j++) {
				iArr_sum[j] = iArr2[j - iArr1.length];
			}
		}
		
		for(int i = 0; i < iArr_sum.length; i++) {
			System.out.println(iArr_sum[i]);
		}


		
		
		
		
	}

}
