package chap04_controlstatement;

import java.util.Scanner;

public class _08_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Scanner sc = new Scanner(System.in); // ctrl + shift + o
		
		while(true) {
			System.out.println("2~9까지 입력. 0, 1 종료 : "); // 0 혹은 1 입력시 종료
			num = sc.nextInt(); // int로 받아줍니다!
			
			if(num == 0 || num == 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			for(int i = 2; i <= num; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.print(i + " * " + j + " = " + i * j + "\t"); //2부터 입력까지 표출하는 구구단 비슷한 것이다.
				}
				System.out.println();
			}
			
		}

	}

}
