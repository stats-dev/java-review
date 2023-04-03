package chap98_homework_nc230403;

public class _03_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------연산자--------------------
//		1. public static void main(String[] args) {
//		   위 코드처럼 1 ~ 10까지의 숫자를 3가지 조건으로 나눌 때 가장 적합한 조건으로 채워주세요.
//
		int[] test1 = new int[3];
		int[] test2 = new int[4];
		int[] test3 = new int[3];
		    for(int i = 1; i <= 10; i++) {
				if(i % 3 == 0) {
					// 3, 6 ,9
					System.out.println("[3,6,9]" + i);
				} else if(i % 3 == 1) {
					// 1, 4, 7, 10
					System.out.println("[1,4,7,10]" + i);
				} else if(i % 3 == 2) {
					// 2, 5, 8
					System.out.print("[2,5,8]" +i);
				}
				
		    }
//		2. 중첩 삼항 연산자를 이용해서 1 ~ 20까지의 숫자중 소수를 판별하여 소수면 "xx는 소수입니다."라고 출력하고 소수가 아니면 4의 배수인지 판별하여
//		     "xx는 4의 배수입니다."라고 출력하고 4의 배수가 아니면 "xx는 4의 배수가 아닙니다."라고 출력하세요.
		    

		    boolean isPrime = false;
		    for(int i = 1; i <= 20; i++) {
		    	for(int j = 2; j <= i / 2; j++) {
		    		isPrime = (i <= 1) ? false : (i % j == 0 && i !=j) ? false : true;
//		    		result = isPrime ? (i + "는 소수입니다.") : (i % 4 == 0) ? (i + "는 4의 배수입니다.") : (i + "는 4의 배수가 아닙니다.");
		    		
		    	}
		    	System.out.println(i + (isPrime ? "는 소수입니다." : (i % 4 == 0) ? "는 4의 배수입니다." : "는 4의 배수가 아닙니다."));
		    }
		    
	}

		
		
	
	
}

