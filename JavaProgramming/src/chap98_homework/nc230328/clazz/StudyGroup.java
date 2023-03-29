package chap98_homework.nc230328.clazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class StudyGroup<T> {
	List<T> tList = new ArrayList<T>(); // 그룹의 리스트로 만드는 arrayList 제작!

	
	//Getter setter 만들어줌.
	public List<T> gettList() {
		return tList;
	}

	public void settList(List<T> tList) {
		this.tList = tList;
	}
	
	// 6개 조의 조장 확인하는 엔트리 리스트를 만들어준다.
	public List<Entry<String, String>> getCaptins() {
		List<Entry<String, String>> entList = 
							new ArrayList<Entry<String, String>>();
		
		for(T t : this.tList) {
			Group g = (Group)t; // 그룹으로 형변환도 가능하다!
			entList.add(g.getCaptin()); // 각 조의 조장을 뽑고, entList에 담아주고 반환한다.
		}

		return entList;
	}
}
