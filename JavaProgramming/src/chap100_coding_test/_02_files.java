package chap100_coding_test;

import java.util.Scanner;

public class _02_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();

		//		개행 문자 정리(/n 은 nextLine()으로 받는다.)
		sc.nextLine();
				
		String[] fileArr = new String[N]; 
		
		for(int i = 0; i < N; i++) {
			fileArr[i] = sc.nextLine();;
		}
		
		
		
		for(int i = 0; i < N; i++) {
			if(fileArr[i].contains(".")) {
				fileArr[i].stripLeading()
			}
			
					
		}
		sc.close();
	}

}
