package chap98_homework_nc230316;

import java.util.Random;

public class _01_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 20개 배열을 선언하세요
//	    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//	    먼저 인덱스의 홀수번째는 앞에서부터 출력하고
//	    짝수번째는 뒤에서부터 출력하세요
		
		int[] intArr = new int[20];
		
		Random rand = new Random();
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = rand.nextInt(100);
		}
		
		for(int i=0;i<intArr.length;i++) {
			System.out.println();
			if(i % 2 == 0) {
				System.out.print("짝수 인덱스 " + i + ": " + intArr[intArr.length - i - 1]); // 인덱스 짝수는 뒤에서 출력
			} else {
				System.out.print("홀수 인덱스 " + i + ": " + intArr[i]); // 홀수는 그대로 출력
			}
			
		}
		
//		System.out.println("---------------------");
//		System.out.println("짝수 인덱스 :");
//		for(int i=0;i<intArr.length;i+=2) {
//			System.out.print("인덱스"+ i + ": " + intArr[intArr.length - i - 1] + " "); // 인덱스 짝수는 뒤에서 출력
//		}
//		
//		System.out.println("---------------------");
//		System.out.println();
//		System.out.println("홀수 인덱스 :");
//		for(int i=1;i<intArr.length;i+=2) {
//			System.out.print("인덱스" + i + ": " + intArr[i] + " "); // 홀수는 그대로 출력
//			
//		}
//		
//		System.out.println("---------------------");
//		System.out.println();
//		System.out.println("전체 인덱스");
//		for(int i=0;i<intArr.length;i++) {
//			System.out.print(intArr[i] + " "); // 홀수는 그대로 출력
//			
//		}
		
		
		

	}

}
