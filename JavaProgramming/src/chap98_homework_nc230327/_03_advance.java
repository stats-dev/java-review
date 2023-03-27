package chap98_homework_nc230327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> strCnt = new HashMap<Character, Integer>();
		
		String input = sc.next();
		
		char[] test = input.toCharArray();
//		System.out.println(test);
		int cnt = 1;
		for(int i = 1; i < test.length; i++) {
			
//			strCnt.put(test[i-1], cnt);
			if(test[i] == test[i-1]) {
				strCnt.put(test[i-1], cnt++);
			} else {
				continue;	
			}
			
			
			System.out.println(strCnt);
		}
		
//		System.out.println(strCnt);
//		strCnt.put(, null)
		
		

	}

}
