package chap98_homework_nc230328;

import java.util.Scanner;

public class _06_array6 {

	public static void main(String[] args) {
	
//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
//
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		String max = null, min = null;
		
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		
		for(int i = 0; i < str.length; i++) {
			
			if(str[0].length() >= str[i].length()) {
				max = str[0];
			} else {
				max = str[i];
			}
			
			if(str[0].length() <= str[i].length()) {
				min = str[0];
			} else {
				min = str[i];
			}
			
		}
		
		System.out.println("길이가 가장 긴 문자열은 " + max + "이고, 길이가 가장 작은 문자열은 " + min + " 입니다.");


		sc.close();
	}

}
