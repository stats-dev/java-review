package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _05_arrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
//			System.out.print(intArr[i] >= 5 ? intArr[i]+ ", " : null);
			System.out.print(intArr[i] + ", ");
		}
		
		
								//IntStream.of(intArr) 도 가능하다!
		IntStream intStream = Arrays.stream(intArr);
		

//		//5이상인 값들만 스트림으로 만들기
//		
		IntStream test = intStream.filter(c -> c >= 5);
		
			
		//* 4 새로운 스트림 만들기
		IntStream testNew = test.map(c -> {
			c = c * 4;
			return c;
		});
		
		testNew.forEach(c -> System.out.println(c));


		
		//체이닝 기법
//		intStream.filter(c -> c >= 5).map(c -> c * 4).forEach(c -> System.out.print(c + ", "));
		
	}

}
