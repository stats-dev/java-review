package chap16_collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> strSet = 
				new HashSet<String>();// set은 자식클래스로 받아주는 게 일반적이다.
		
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("Javascript");
		strSet.add("Html/Css");
		//중복 값 저장
		strSet.add("JDBC");
		strSet.add("Java");
		strSet.add("React.js"); // 7개 넣는데 중복값 제외하고 5개만 들어간다.
		
		System.out.println("strSet의 크기 : " +
				strSet.size());
		
		
		int idx = 0;
		//순서가 무작위로 들어가요!
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(idx++ 
					+ ":" + str);
			if(str.equals("Html/Css")) {
				System.out.println(idx++ 
						+ ":" + str); // 이것땜에 다시 나온거십니다.
			}
		}
		
//		이렇게 순서없이 무작위로 들어간다.
//		strSet의 크기 : 5
//		0:Java
//		1:Javascript
//		2:JDBC
//		3:React.js
//		4:Html/Css
//		5:Html/Css
//		strSet의 크기 :
		
		strSet.remove("JDBC");
		System.out.println("strSet의 크기 : " +
				strSet.size());
		
		
		strSet.clear();
		if(strSet.isEmpty()) {
			System.out.println("strSet은 비어있습니다.");
		} else {
			System.out.println("strSet은 비어 있지 않습니다.");
		}
		
		
		
		
		
		
		
		
		
	}

}
