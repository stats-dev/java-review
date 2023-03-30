package chap98_homework_nc230328;

import java.util.Scanner;

public class _01_variables3 {

	public static void main(String[] args) {
		
		
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
		Scanner sc = new Scanner(System.in);
		
		int r = 20;
		final double PI = 3.14; 
		double area = Math.pow(2 * PI * r, 2) ;
		double circum = 4 * PI * r;
		System.out.println("원의 넓이: " + area + "원의 둘레: " + circum);
		
	
	    sc.close();
	    
	}
	
	

}
