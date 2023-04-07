package chap21_stream;

import java.util.Arrays;

public class _14_mathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		
		//개수
		long cnt = Arrays.stream(intArr)
						 .count();
		
		System.out.println("요소의 개수는 " + cnt);
		
		
		//첫 번째 요소
		int first = Arrays.stream(intArr)
						  .findFirst().getAsInt();
		
		System.out.println("첫 번째 요소는 " + first);
		
		//최대 최소 값
		int max = Arrays.stream(intArr)
						.max().getAsInt();
		
		int min = Arrays.stream(intArr)
						.min().getAsInt();
		
		System.out.println("최대 값은 " + max + ", 최소 값은 " + min);
		
		
		//합계와 평균
		int sum = Arrays.stream(intArr)
						.sum();
		
		double avg = Arrays.stream(intArr)
							.average()
							.getAsDouble(); //옵셔널더블 타입으로 나오므로, 반드시 Double로 변경해야 double로 저장이 됩니다. 안하면 에러가 남.
		System.out.println("합계는 " + sum + ", 평균은 " + avg);
		
		//합계와 평균
		sum = Arrays.stream(intArr)
						.filter(i -> i % 2 ==0) //이렇게 조건을 두고 원하는 합계만 뽑을 수도 있어요!
						.sum();
		
		System.out.println("합계는 " + sum + ", 평균은 " + avg);


	}

}
