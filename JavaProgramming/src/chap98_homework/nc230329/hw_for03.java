package chap98_homework.nc230329;

import java.util.Scanner;

public class hw_for03 {

	public static void main(String[] args) {
		//반복문 3.
		//3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		
//		int cnt = 0; //약수의 개수를 셀 변수를 산다.
		//시간 초과가 날 수 있다.		
		// 1이 아니라 2부터 검사를 하면 된다.
		for(int i = 2; i <= inputNum; i++) {
			int cnt = 0; //약수의 개수를 셀 변수를 산다.
			
			//이중for문 //본인말고 나누어떨어지는 값이 없어야함. 근데 이게 아닌 조건임을 기억.
			for(int j = 2; j <= i; j++) {
				if(i % j == 0 && i != j) { 
					//자기 자신이 아닌 다른 값으로 나눠 떨어짐.
					cnt++; //자기자신 말고 다른 값으로 나누어 떨어진다.
					break; // break로 더 못돌도록 막아줘도 상관없다.
				}
			}
			

			
			if(cnt == 0) {
				System.out.println(i); // cnt가 없는 케이스가 바로 소수라고 할 수 있다.
			}
		}
		
		
		sc.close();
		
		
		
		
		
	}
	
	
}
