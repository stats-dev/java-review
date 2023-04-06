package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _09_numberConvertStream {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
			System.out.println(intArr[i]);
		}
		
		IntStream intStream = Arrays.stream(intArr);
		
		intStream.asDoubleStream() //double 형변환
				 .forEach(dNum -> System.out.println(dNum));
		
		intStream = Arrays.stream(intArr); //다시 사용하려면 반드시 초기화해야함.
		
//		String printStr = "";
		
		
		intStream.boxed()
				 .forEach(iNum -> {
					 System.out.println(iNum.intValue());
					 System.out.println(iNum.getClass().getSimpleName());
		}); //iNum의 intValue 펑선으로도 가능.
		
	}

}
