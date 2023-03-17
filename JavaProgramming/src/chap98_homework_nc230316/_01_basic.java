package chap98_homework_nc230316;

import java.util.Random;
import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.int배열을 10개 생성해라.
//		 int배열에 3의 배수를 차례대로 저장해라.
//		 그리고 거꾸로 출력해라.
		
		// 차례대로 저장
		int[] intArr = new int[10];
		for(int i=0;i<intArr.length;i++) {
			
			intArr[i] = 3 * (i+1);
			
		}
		
		// 거꾸로 출력
		for(int i=0;i<intArr.length;i++) {
			
			System.out.print(intArr[9-i] + " ");
			
		}
		
		
		System.out.println("---------------------------");
//		2.int배열을 10개 생성해라
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 
//		  총합을 구하세요
		
		int[] intArr1 = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
				
		for(int i=0;i<intArr1.length;i++) {
			intArr1[i] = sc.nextInt();
			sum += intArr1[i];
		}
		
		System.out.println("결과: ");
		for(int i=0;i<intArr1.length;i++) {
			System.out.println(intArr1[i]);
		}
		System.out.println("총합: " + sum);

		System.out.println("---------------------------");
		
//		3.int 배열로 10개의 공간을 생성하라
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하라
		int[] intArr2 = new int[10];
		
		Random rand = new Random();
		
		for(int i=0;i<intArr2.length;i++) {
			intArr2[i] = rand.nextInt(10) + 1;	
			if(intArr2[i] % 2 != 0) {
				System.out.println(intArr2[i]);
				//continue;
			}
		}
		
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]);	
		}
		
		System.out.println();
		
		System.out.println("---------------------------");
//		4. 정수 10개를 입력받아 배열에 저장하고, 
//		이 정수중에서 2의 배수와 3의 배수를 출력하세요
		int[] intArr3 = new int[10];
		
		for(int i=0;i<intArr3.length;i++) {
			intArr3[i] = sc.nextInt();
			
		}
		
		for(int i=0;i<intArr3.length;i++) {
			if(intArr3[i] % 2 == 0 || intArr3[i] % 3 == 0) {
				System.out.println(intArr3[i]);
			}
		}
		

		
		
		
		

	}

}
