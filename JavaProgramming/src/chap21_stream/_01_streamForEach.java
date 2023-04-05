package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_streamForEach {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1); //1부터 10 랜덤
			System.out.println(intList.get(i) + ", ");
		}
		System.out.println();
		
		
		//변수명 아무거나
		Stream<Integer> intStream = intList.stream();
		
		//num을 하나씩 sum에다가 더해주는 람다식으로 구현할 수 있게 됩니다!!
		intStream.forEach(num -> sum += num); //0부터 하나씩 반복해서 추가
		
		System.out.println("총 합 : " + sum);
		
		

	}

}
