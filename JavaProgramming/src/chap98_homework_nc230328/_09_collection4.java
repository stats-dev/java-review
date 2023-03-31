package chap98_homework_nc230328;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _09_collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
		Map<String, Integer> score = new HashMap<String, Integer>();
		
		score.put("홍길동", 50);
		score.put("강길동", 90);
		score.put("박길자", 99);
		score.put("김길동", 92);
		score.put("박길동", 84);
		

		Set<Entry<String, Integer>> scoreSet = score.entrySet();
		
		Iterator<Entry<String, Integer>> it = scoreSet.iterator();
		
		int maxVal = 0;
		String maxName = null; 
		while(it.hasNext()) {
			Entry<String, Integer> ent = it.next();
			if(ent.getValue() > maxVal) {
				maxName = ent.getKey();
				maxVal = ent.getValue();
			}
		}
		
		System.out.println(maxName + maxVal);
		
		


	}

}
