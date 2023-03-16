package chap98_homework_nc230315;

public class _03_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<= 1000;i++) {
			
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;

			}
					
		}
		System.out.println("숫자들의 합:" + sum);

	}

}
