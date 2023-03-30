package chap98_homework_nc230328;

import java.util.Scanner;

public class _06_array8 {

	public static void main(String[] args) {

//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//		    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. (-기준으로 구분)");
		
		String input = sc.nextLine();
		String[] str = input.split("-");
		
		int maxIndex = 0;
		int maxLen = str[0].length();
		
		// 문자열 배열을 만들고, 이걸 반복해서 확인
		for(int i = 0; i < str.length; i++) {
			if(maxLen > str[i].length()) {
				continue;
			} else {
				maxLen = str[i].length();
				maxIndex = i;				
			}
		}
		
		System.out.println("가장 길이가 긴 문자열의 인덱스: " + maxIndex + " 그 문자열은 " + str[maxIndex] + "입니다.");

		
		

		
		
		
		
	}

}
