package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class _05_linkedList_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList와 LikedList 속도 비교
		
		//순차적 데이터 넣기 속도 비교
		List<String> aList = new ArrayList<String>();
		List<String> lList = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		
		for(int i = 0; i < 1000000; i++) {
			aList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		//날짜정보를 시간으로 가져온다
		System.out.println("ArrayList에 순차적으로 데이터를 추가하는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		
		for(int i = 0; i < 1000000; i++) {
			lList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		//날짜정보를 시간으로 가져온다
		System.out.println("LinkedList에 순차적으로 데이터를 추가하는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");

		
		System.out.println("-------------------------------");
		
		//contains 메소드 속도 비교
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		System.out.println(aList.contains("900000"));
		endTime = System.nanoTime();

		System.out.println("ArrayList에서 값 900000을 찾는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");
		
		
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		System.out.println(lList.contains("900000"));		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList에서 값 900000을 찾는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");

		
		
		System.out.println("-------------------------------");
		
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		System.out.println(aList.get(80000));		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList에서 인덱스 80000을 접근하는 데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");


		startTime = System.nanoTime(); // 현재 시간을 long 변경
		System.out.println(lList.get(80000));		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList에서 인덱스 80000을 접근하는 데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");

		
		System.out.println("-------------------------------");

		// List 중간에 값 추가 속도 비교
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		
		for(int i=1000;i<5000;i++) {
//			aList.add(String(i,80000)));			
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList에서 중간에 데이터를 추가하는 데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");

		
		startTime = System.nanoTime(); // 현재 시간을 long 변경
		System.out.println(lList.get(80000));		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList에서 인덱스 80000을 접근하는 데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");

		Set<String> set1 = Set.of("A", "a", "A", "a", "A");
	}

}
