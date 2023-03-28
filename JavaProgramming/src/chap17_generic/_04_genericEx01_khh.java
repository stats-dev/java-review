package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number 상속 받는 T
		//리턴타입 List<T> getEven(List<T> list)
		
		List<Integer> intList = new ArrayList<Integer>(); // 타입 미지정시 경고
		
		
		//데이터 추가(add)
		for(int i = 0; i < 10; i++) {
			intList.add(i+1);
		}
		
		System.out.println(_04_genericEx01_khh.getEven(intList));


	}
	
	
	
	public static <T extends Number> List<T> getEven(List<T> list) {
		
		List<T> input = new ArrayList<T>();
		
		for(int i = 1; i < list.size(); i++) {
			if((int) list.get(i) % 2 == 0)
				input.add((list.get(i)));
		}
		
		return input;
	}
	
//	public static <T extends Number> List<T> getEven(List<T> list) {
//		List<T> returnList = new ArrayList<T>();
//		
//		//향상된 for 문
//		for(T t : list) { //double을 int로 가져올 때 슴.
//			if(t.intValue() % 2 == 0 ) {
//				returnList.add(t);
//			}
//		}
//		
//		return returnList; //이렇게 반환이 됩니다.
//	}


	
	
	
	
	
	

}
