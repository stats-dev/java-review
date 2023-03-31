package chap98_homework_nc230328;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _09_collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
		Map<String, String> dict = new HashMap<String, String>();
		
		//단어와 뜻 저장
		dict.put("company", "회사");
		dict.put("color", "색상");
		dict.put("price", "가격");
		
		//사용자 입력한 단어 "company"
		//출력
		Scanner sc = new Scanner(System.in);
		System.out.println(dict.get(sc.next()));
		
		sc.close();
	}

}
