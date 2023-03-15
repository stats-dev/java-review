package chap04_controlstatement;

public class _05_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		
		while(num <= 100) {
			sum += num++; // 1부터 100까지의 합이 나온다.
		}
		
		
		System.out.println("1~100까지의 합: " + sum); //num이 101이 되는 순간 종료됨.

		// 1~100까지의 합: 5050

	}

}
