package chap21_stream;

import java.util.Arrays;

public class _10_flatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{{1,2}, {3,4}, {5,6}}
		//Stream<int[]>
		//Stream<Stream> .flatMap => Stream<Integer>
		int[][] intArr = {{1,2}, {3,4}, {5,6}};
		
		Arrays.stream(intArr)
//		  	  .flatMapToInt(arr -> Arrays.stream(arr)) //기존 방식
			  //참조 방식
			  .flatMapToInt(Arrays :: stream) //array에 있는 각 요소를 다시 스트림으로 바꾼다. int이므로 Integer 형태로 바꿔야 한다.
//			  .map(num -> num * 3) //map은 옵션
			  .forEach(num -> System.out.println(num)); //여러개를 하나의 스트림으로 합쳐서 출력해준다.

	}

}
