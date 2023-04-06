package chap20_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap20_lambda.clazz.UserCharString;

public class _10_lambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<UserCharString> ucsList = new ArrayList<UserCharString>();
		
		//10개 입력
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요.");
			String str = sc.nextLine();
			ucsList.add(new UserCharString(str));
		}
		
		
		
		System.out.println("찾을 문자를 입력하세요.");
		char findCh = sc.nextLine().charAt(0);
		
		UserCharString ucs = new UserCharString();
		
		
		sc.close();
		
		
		

	}

}
