package chap100_coding_test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _06_photos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"may","kein","kain","radi"};
		int[] year = {5,10,1,3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
		int[] result = new int[photo.length];
		int sum = 0;
		//map으로 이름과 year 값을 연결해줍니다.
		Map<String, Integer> photoMap = new HashMap<String, Integer>();
		
		for(int i = 0;i < name.length; i++) {
			photoMap.put(name[i], year[i]);
		}
		
		System.out.println(photoMap.toString());
		
		Set<Entry<String, Integer>> photoSet = photoMap.entrySet();
		
		
	

		
			for(int i = 0; i < photo.length; i++) {
				sum = 0;
					for(Map.Entry<String, Integer> ent : photoMap.entrySet()) {
						for(String n : photo[i]) {
							if (n.equals(ent.getKey())) {
								sum += ent.getValue();

							}
							result[i] = sum;
						}
						
					}
					
				}
	
			//최종 출력
			for(int r : result) {
				System.out.println(r);
			}


	}

}