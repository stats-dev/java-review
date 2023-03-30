package chap98_homework_nc230328;

public class _05_loop8 {

	public static void main(String[] args) {
		
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
//		8-1. *
//		     **
//		     ***
//		     ****
//		     *****
//		
		for(int i =0; i < 5; i++) {
			for(int j=0; j <= i; j++) {
				String str8 = "*";
				System.out.print(str8);				
			}
			System.out.println();
			
		}
		
		
		
//
//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *
//		
		for(int i =0; i < 5; i++) {
			for(int j=5; j > i; j--) {
				String str8 = "*";
				System.out.print(str8);				
			}
			System.out.println();
			
		}
		

	}

}
