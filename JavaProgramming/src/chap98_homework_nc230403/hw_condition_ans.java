package chap98_homework_nc230403;

public class hw_condition_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String printStr = "";
		
		for(int i = 1; i <= 20; i++) {
			int cnt = 0;
			for(int j = 2; j <= i; j++) {
			
				if(i % j == 0 && i != j) {
					cnt++;
				}

				
				printStr = cnt > 0 
						? i % 4 == 0
						? i + "는 4의 배수입니다."
						: i + "는 4의 배수가 아닙니다."
						: i + "는 소수입니다.";
			}
			
			System.out.println(printStr);
		}

	}

}
