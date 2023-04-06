package chap20_lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import chap20_lambda.clazz.UserCharString;

public class _10_lambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<UserCharString> ucsList = new ArrayList<UserCharString>();

		/*List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();

		for(int i = 0; i < 5; i++) {
			Map<String, String> map = new HashMap<String, String>(); //Map 추상클래스이므로 구현된 친구를 찾아가야 한다.
			
			map.put(String.valueOf(i), String.valueOf(i));
			
			mapList.add(map);
		}
		System.out.println(mapList);
		*/
		
//		UserCharString ucs = new UserCharString(); //객체는 값이다. 생성자를 통해 값을 주어야 한다.
		
		//10개 입력
		for(int i = 0; i < 3; i++) {
			System.out.println("문자열을 입력하세요.");
			ucsList.add(new UserCharString(sc.nextLine()));
//			String userInput = sc.nextLine();
//			ucsList.add(new UserCharString(sc.nextLine()));
			
		}
		
		
		
		System.out.println("찾을 문자를 입력하세요.");
		char findCh = sc.nextLine().charAt(0); //
		
		for(UserCharString u : ucsList) {
			u.changeStr(findCh, (char c, String s) -> {
				String returnStr = "";
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == c) {
						returnStr = s;
					}
				}
				return returnStr;
			});
		}
		
		
//		UserCharString ucs = new UserCharString(null);
//		ucsList.stream().map(c -> c.changeStr(findCh, c));
//		
//			System.out.println(c.toString());));
//		
//		ucs.changeStr(findCh, (ch, str) -> {
//			if(str.contains(String.valueOf(ch))) {
//				System.out.println(str);
//			}
//			
//			
//		});
		
		System.out.println(ucsList);

		
		
		sc.close();
		
		
		

	}

}
