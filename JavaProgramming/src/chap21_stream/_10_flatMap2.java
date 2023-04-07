package chap21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _10_flatMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		
		
		strList.add("abc");
		strList.add("def");
		
//		
//		
//		List<String> returnList = new ArrayList<String>();
//		
//		strList.stream()
//				.flatMap(str -> Arrays.stream(str.split("")));
//		
//		strList.stream()
//				.flatMap(str -> {
//				returnList.add(str);
//				return returnList.stream();
//		}); //다시 스트림으로만든다!

//
//		strList.stream()
//			   .flatMap(str -> Arrays.stream(str.split("")))
//			   .forEach(str -> System.out.println(str));
		
		
		strList.stream()
			   .flatMap(str -> Arrays.stream(str.split("")))
			   .forEach(
					   str -> 
					   System.out.println(str));
		
		
		
		//generate로 스트림으로 다시 만들어줄수 있는데, limit로 횟수만큼 복사하게 할 수 있습니다.
		strList.stream()
			   .flatMap(str -> Stream
					   				 .generate(() -> str) //str 자체를 리턴합니다.
					   				 .limit(2)) //2개씩 복사되도록 할 수 있습니다.
			   .forEach(
					   str -> System.out.println(str));
		
//		
		//map으로도 위 flatmap 구현?
//		strList.stream()
//			   .map(str -> {
//				   for(int i = 0; i < 2; i++) {
//					   return str;					   
//				   }
//				   return "";
//			   })
//			   .forEach(str -> System.out.println(str));
		
	
		
		
		//이중배열 만들기
//		int[][] intArr = {{1, 2}, {2, 3}, {3, 4}};
//		
//		Arrays.stream(intArr)
//			  .flatMap(arr -> Stream.of(arr))
//			  .forEach(arr -> System.out.println(Arrays.asList(arr)));
		
		
		
//		List
		

	}

}
