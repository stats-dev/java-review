package chap98_homework_nc230328;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> strArrList = new ArrayList<String>();
		
		strArrList.add("사과");
		strArrList.add("배");
		strArrList.add("파인애플");
		strArrList.add("바나나");
		strArrList.add("포도");
		
		System.out.println("과일 하나를 입력하세요.");
		String fruit = sc.next();
		
		System.out.println(strArrList.indexOf(fruit));
		
		sc.close();
		
	}

}
