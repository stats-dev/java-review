package chap98_homework_nc230328;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _09_collection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		
		iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		iList.add(5);
		iList.add(6);
		iList.add(8);
		iList.add(8);
		iList.add(9);
		iList.add(9);
		
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		for(int i = 0; i < iList.size() ; i++) {
			iSet.add(iList.get(i));
		}
		
//		System.out.println(iList);
		System.out.println(iSet);


	}

}
