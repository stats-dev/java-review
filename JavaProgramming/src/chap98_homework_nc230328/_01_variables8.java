package chap98_homework_nc230328;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_variables8 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();

//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		
		int count = 0;

	    for (int i = 1; i <= 10; i++) {
	      System.out.print("정수를 입력하세요 (2~30): ");
	      int num = sc.nextInt();
	      
	      if (num < 2 || num > 30) {
	        System.out.println("2부터 30까지의 정수만 입력 가능합니다.");
	        i--;
	        continue;
	      }

	      boolean isPrime = true;
	      for (int j = 2; j < num; j++) {
	        if (num % j == 0) {
	          isPrime = false;
	          break;
	        }
	      }
	      if (isPrime) {
	        count++;
	        prime.add(num);
	      }
	    }

	    System.out.println("입력한 10개의 정수 중 소수의 개수는 " + count + "개 입니다.");
	    System.out.println("입력한 10개의 정수 중 소수는 " + prime + "입니다.");
	
	    sc.close();
	    
	}
	
	

}
