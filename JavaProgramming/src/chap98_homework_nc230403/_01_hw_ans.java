package chap98_homework_nc230403;

import java.util.Scanner;

import chap98_homework.nc230403.IfElseCla;

public class _01_hw_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		--------------------형변환--------------------
//		1. 사용자가 입력한 수(실수나 정수 모두 가능)를 StringBuilder로 받아서 점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.
		System.out.println("정수나 실수를 입력하세요.");
		StringBuilder stb = new StringBuilder(sc.nextLine());
		
		if(stb.indexOf(".") == -1) {
			int convert = Integer.parseInt(stb.toString());
			System.out.println(convert);
		} else { 
			double convert = Double.parseDouble(stb.toString());
			System.out.println(convert);
			
		}
		
		
//		1. 사용자가 입력한 문자열의 길이가 20이상이면 해당 문자열을 거꾸로 출력하고 
//	     20미만이면 문자열에 n, a, v, e, r 다섯개의 문자를 순서대로 추가하여
//	     문자열의 길이가 20이 되면 그 때 문자열을 출력하세요.
		System.out.println("문자열을 입력하세요.");
		String inputStr = sc.nextLine();
		
		
		int cnt = 0;
		if(inputStr.length() >= 20) {
			stb = new StringBuilder(inputStr);
			System.out.println(stb.reverse());
		} else {
			int toTwenty = 20 - inputStr.length(); // 20에서 뺀다.
			char[] chArr = {'n','a','v','e','r'};
			
			for(int i=0; i < toTwenty; i++) {
				if(i < 5) {
					inputStr = inputStr.concat(
							String.valueOf(chArr[i]) //concat으로 하나씩 붙여줄 수 있습니다.
							);
				} else {
					if(i % 5 == 0) { //i가 5번 다 돌았단 뜻이다.
						cnt++;						
					}
					
					inputStr = inputStr.concat(
							String.valueOf(chArr[i - (5 * cnt)])
							);
							
				}
			}
		}
		System.out.println(inputStr);
		
//		1. 1~20까지 랜덤한 값을 생성해서 생성한 랜덤 값만큼 반복되는 반복문을 만들고
//	    반복문에서 사용자가 입력한 문자열에 "bit"를 계속 추가하세요. 그리고 bit가 몇 번
//	    추가됐는지 개수를 세서 출력하세요. 랜던 값을 그대로 출력하면 안됩니다.
		System.out.println("문자열을 입력하세요.");
		inputStr = sc.nextLine();
		
		for(int i = 0; i < (int) (Math.random() * 20) + 1; i++) {
			inputStr = inputStr.concat("bit");
		}
		System.out.println(inputStr);
		
		int length = inputStr.length() - inputStr.replace("bit", "").length();
		//이렇게 보면 bit 빠진 것의 길이를 빼면, bit 들어간 길이가 보인다. 
		
		System.out.println(length / 3);
		
//		--------------------배열--------------------
//		1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//		   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
		char[] chArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

		String str1 = "";
		String str2 = "";
		String str3 = "";
		String str4 = "";
		
		for(int i = 0; i < chArr.length; i++) {
			if(i % 4 == 0) {
				str1 = str1.concat(String.valueOf(chArr[i]));
			} else if(i % 4 == 1) {
				str2 = str2.concat(String.valueOf(chArr[i]));
			} else if(i % 4 == 2) {
				str3 = str3.concat(String.valueOf(chArr[i]));
			} else if(i % 4 == 3) {
				str4 = str4.concat(String.valueOf(chArr[i]));
			} 
		}
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("1~10 정수를 하나 입력하세요.");
		inputStr = sc.nextLine();
		
		IfElseCla iec = new IfElseCla();
		iec.makeElseIf(Integer.parseInt(inputStr));
		
		
		sc.close();
		
		
		

	}

}
