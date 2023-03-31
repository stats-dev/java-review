package chap98_homework.nc230329;

import java.util.Scanner;

public class hw_ar08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		
		String[] strArr = inputStr.split("-");
		
		String maxLength = strArr[0]; // 0번째 넣고 공략
		
		for(int i = 1; i < strArr.length; i++) {
			if(strArr[i].length() > maxLength.length()) {
				//둘다 길이를 비교해야 한다.
				maxLength = strArr[i];
			}
		}
		
		
		System.out.println(maxLength);

	}
	
}
