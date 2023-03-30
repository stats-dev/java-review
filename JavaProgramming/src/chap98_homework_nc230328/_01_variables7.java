package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		System.out.println("1부터 9 사이의 정수 중 하나를 입력하세요.");
		int fac = sc.nextInt();
		int result = 1;
	
		for(int i = 2; i <= fac ; i ++) {
			result *= i;
		}
		
		System.out.println("for 반복문 : " + fac + "의 팩토리얼 : " + result);

//		int result1 = 1;
//		int index = 1;
//		while(index <= fac) {
//			result1 *= index;
//			index++;
//		}
		
//		System.out.println("while 반복문 : " + fac + "의 팩토리얼 : " + result1);

	    sc.close();
	    
	}
	
	

}
