package chap100_coding_test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
		
		for(String[] p : photo) {
			sum = 0;
			
			for(int i = 0; i < p.length; i++) {
				if (p[i].equals("may")) {
					sum += 5;
				} else if(p[i].equals("kein")) {
					sum += 10;
				} else if(p[i].equals("kain")) {
					sum += 1;
				} else if(p[i].equals("radi")) {
					sum += 3;
				}
			}
			
//			photoMap.put(p.toString(), sum);

		}
		
//		System.out.println(photoMap.toString());
		//entryset으로 잘 나오게 출력해보기.
		
		

		
//		if(photo[1])
		
		
	}

}
