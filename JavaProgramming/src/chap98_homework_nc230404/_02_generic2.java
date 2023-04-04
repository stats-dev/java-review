package chap98_homework_nc230404;

import java.util.List;

import chap98_homework_nc230404.generic.TList;

public class _02_generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을
//	     구현하세요.(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
		
		TList<Integer> test = new TList<Integer>();
		
		for(int i = 0; i < 11; i++) {
			test.add(i);			
		}
		
		List<Integer>[] split = test.splitList();
		
		System.out.println("초기: " + test.getList());
		System.out.println("분할 1: " + split[0]);
		System.out.println("분할 2: " + split[1]);
		
	
	
	}
}


