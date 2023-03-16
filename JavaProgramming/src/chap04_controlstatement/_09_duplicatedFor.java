package chap04_controlstatement;

public class _09_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 별찍기!!!
		//삼각형 별 찍기
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) { // 행렬을 생각하라
					System.out.print("*");
				}
			}
			System.out.println(); // 엔터값 입력!!! 
		}
		
		//(5,1) (4,2, 5,2) (3,3, 4,3, 5,3)
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		*/
		
		System.out.println("---------------");

		for(int i = 0; i < 5; i++) {
			for(int j =4; j >= 0; j--) {
				if(i >= j) {
					System.out.print(("*"));
				} else {
					System.out.print((" "));
				}
				
			}
			System.out.println();
		}
		
		
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		*/
		
		System.out.println("---------------");
		
		for(int i=0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		


//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println(); // 엔터값 입력!!! 
//		}
//		
		
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		*/

		System.out.println("44---------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j =0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		

		

	}

}
