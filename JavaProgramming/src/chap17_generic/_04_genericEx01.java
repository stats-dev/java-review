package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i+1);
		}
		
		
//		System.out.println(_04_genericEx01.<Integer>getEven(intList));
		
		System.out.println(_04_genericEx01.getEven(intList)); //자바의 타입추론 기능으로 그냥 가능하긴 하다.
		
		
		
		
	}
	
	
	
	public static <T extends Number> List<T> getEven(List<T> list) {
		List<T> returnList = new ArrayList<T>();
		
		//향상된 for 문
		for(T t : list) { //double을 int로 가져올 때 슴.
			if(t.intValue() % 2 == 0 ) {
				returnList.add(t);
			}
		}
		
		return returnList; //이렇게 반환이 됩니다.
	}

}
