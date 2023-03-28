package chap98_homework_nc230327;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
////	     4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
////		
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("4명의 학생 데이터를 이름과 점수 순으로 입력하시오.");
//		for(int i = 0;i<4;i++) {
//			map.put(sc.next(), sc.nextInt());
//		}
//		
//		
//		Object[] test = map.values().toArray();
////		System.out.println(test);
//		int result = 0;
//		for(int i = 1; i < map.size();i++) {
//			if((int) test[i] > (int) test[i-1]) {
////				System.out.println(test[i]);
//				result = (int) test[i];
//			}		
////			System.out.println("가장큰 값:" + result);
//		}
//
//		//Map에 어떤 데이터가 들어있는지 확인할 대
//		//Entry의 Set을 생성하고 Iterator를 꺼내서 Key, Value를 하나씩 확인한다.
//		Set<Entry<String, Integer>> mapSet = map.entrySet(); // Set 내부에 있는 Entry를 먼저 선언한다.
//		
//		
//		//Set 내부 확인
//		Iterator<Entry<String, Integer>> it = mapSet.iterator();
//		
//		while(it.hasNext()) {
//			Entry<String, Integer> ent = it.next();
//			if(ent.getValue() == result) {
//				System.out.println("최고 점을 맞은 학생의 이름은 " + ent.getKey() + "이고 점수는 " + ent.getValue() + "입니다.");
//			}
//				
//			
//		}
//		
//		sc.close();
//		
//		2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 
//	    Map<String, Integer>에 담은 후 출력하세요. 
//	  ex) {"3" : 1({1, 2}), "4" : 1({1, 3}, "5" : 2({1, 4}, {2, 3})
		int[] intArr = {1,2,3,4,5};
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		for(int i=1; i<intArr.length;i++) {
			for(int j=1; j<intArr.length;j++) {
				if(i<j) {
					if(i+j == 3) {
						System.out.println(i + "," + j + "합: " + (i+j));
						map1.put("3", ++index1);
					} else if (i+j == 4) {
						System.out.println(i + "," + j + "합: " + (i+j));
						map1.put("4", ++index2);
					} else if (i+j == 5) {
						System.out.println(i + "," + j + "합: " + (i+j));
						map1.put("5", ++index3);
						
					} else {
						break;
					}
					
				}
			}
			
		}
		
		System.out.println(map1);
		

	}

}
