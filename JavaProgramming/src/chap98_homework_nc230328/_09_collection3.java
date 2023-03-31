package chap98_homework_nc230328;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _09_collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
		Map<String, Integer> score = new HashMap<String, Integer>();
		
		score.put("홍길동", 50);
		score.put("강길동", 90);
		score.put("김길동", 92);
		score.put("박길동", 84);
		

		Set<Entry<String, Integer>> scoreSet = score.entrySet();
		
		Iterator<Entry<String, Integer>> it = scoreSet.iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> ent = it.next();
			if(ent.getValue() >= 90) {
				System.out.println(ent.getKey());
			}
		}

		
	}

}
