package chap98_homework_nc230315;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------");
		System.out.println("1. 10 ~ 1까지 거꾸로 while문으로 출력");
		//1. 10 ~ 1까지 거꾸로 while문으로 출력
		int i = 0;
		while(i < 10) {
			System.out.println(10 - i);
			i++;
		}
		
		System.out.println("----------------");
		System.out.println("2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력");
//		2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		i = 0;
		do {
			System.out.println(10 - i);
			i++;
		} while (i < 10);
		
		System.out.println("----------------");
		System.out.println("3. 10 ~ 1까지 거꾸로 for문으로 출력");
//		3. 10 ~ 1까지 거꾸로 for문으로 출력
		for(i=0;i<10;i++) { 
			System.out.println(10-i);
		}
		
		System.out.println("----------------");
		System.out.println("4. 1 ~ 100까지 합을 while문으로 출력");
//		4. 1 ~ 100까지 합을 while문으로 출력
		int sum = 0;
		i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		System.out.println("----------------");
		System.out.println("5. 1 ~ 100까지 합을 do ~ while문으로 출력");
//		5. 1 ~ 100까지 합을 do ~ while문으로 출력
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while(i<=100);
		
		System.out.println(sum);
		
		System.out.println("----------------");
		System.out.println("6. 1 ~ 100까지 합을 for문으로 출력");
//		6. 1 ~ 100까지 합을 for문으로 출력
		sum = 0;
		
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
