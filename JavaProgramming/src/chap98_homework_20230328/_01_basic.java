package chap98_homework_20230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		
		for(int i = 0 ; i < 10; i ++) {
			aList.add(i);
		}
		
		List<Integer> bList = new ArrayList<Integer>();
		for(int i = 0 ; i < 10; i ++) {
			bList.add(i);
		}
		
//		System.out.println(aList);
		
		
		
		Integer a = 10;
		Double b = 3.14;
		String c = "hello";
		System.out.println(GenericCla.add(a, b)); // "103.14"
		System.out.println(GenericCla.add(a, c)); // "103.14"

		
		
		System.out.println(GenericCla.add(aList));
		
		GenericCla.printArr(aList);

		
		Integer[] arrTest = {1,2,3,4,5};
		
		System.out.println(GenericCla.getMin(arrTest));
		
		Map<String, Integer> test = new HashMap<String, Integer>();
		
		test.put("test123", 1234444444);
		test.put("test1", 123444567);
		
		GenericCla.printOverTen(test);
		
		
		
		
		
		
	}

}
