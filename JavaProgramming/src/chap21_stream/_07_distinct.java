package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _07_distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,2,3,4,5,5,4,4,3};
		
		IntStream intStream = Arrays.stream(intArr);
		//Stream에서 중복된 거 다 제거해주는 고마원 메소드
		intStream.distinct()
				 .forEach(num -> System.out.println(num));
		
		

	}

}
