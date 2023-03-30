package chap98_homework_nc230328;

import java.util.Scanner;

public class _06_array2 {

	public static void main(String[] args) {

//		**2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
		Scanner sc = new Scanner(System.in);

		int size = 100;
		int index = 0;
		int[] iArr = new int[size];

		while(true) {
			System.out.println("정수를 입력하세요.");
			
			String str = sc.nextLine();

			if (str.equals("q")) {
				break;
			} 
			try {
				iArr[index] = Integer.parseInt(str);
				index++;
				continue;
				
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}
		
		for(int i = 0; i < index; i++) {
			System.out.println(iArr[i]);
		}
		
	
		
		sc.close();
		
		
		

		
		
		
		
	}

}
