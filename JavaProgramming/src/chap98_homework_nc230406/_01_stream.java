package chap98_homework_nc230406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		--------------------스트림--------------------
//		1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			strList.add(sc.nextLine());
		}
		
//		Stream<String> strStream = strList.stream();
//		strStream.filter(c -> c.length() >= 5)
//				 .forEach(str -> System.out.println(str));
//		
		strList.stream()
						.filter(c -> c.length() >= 5)
						.forEach(str -> System.out.println(str));
		


	}

}
