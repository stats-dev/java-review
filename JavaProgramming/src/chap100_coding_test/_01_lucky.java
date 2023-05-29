package chap100_coding_test;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 123402;
		
		System.out.println(n);

//		int N = 99999999;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int len = String.valueOf(N).length();
		
		String strN = String.valueOf(N);
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i =0; i<len; i++) {
			if(i < len/2) {
				sum1 += ((int)(strN.charAt(i)) - '0');
			} else {
				sum2 += ((int)(strN.charAt(i)) - '0');
			}
			
		}
//		System.out.println(String.valueOf(sum1).equals(String.valueOf(sum2)));
		if(sum1 == sum2) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
		
		sc.close();
//		System.out.println(sum1);
//		System.out.println(sum2);
		
//		for(int i=0;i<)
	}

}
