package chap98_homework.nc230328.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Group {
	private Map<String, String> memberMap = 
						new HashMap<String, String>(); // 멤버변수 memberMap 선언.
	
	public Group() {
		
	}
	
	public Group(Map<String, String> map) {
		this.memberMap = map;
	}

	public Map<String, String> getMemberMap() {
		return memberMap;
	}

	public void setMemberMap(Map<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	
	public Entry<String, String> getCaptin() { //현재 그룹의 조장을 리턴하는 Entry를 만든다.
		Entry<String, String> returnEnt = null; //처음 entry는 null로 초기화한다.
		
		for(Entry<String, String> ent : this.memberMap.entrySet()) {
			if(ent.getValue().equals("조장")) {
				returnEnt = ent;
			}
		}
		
		return returnEnt;
	}

//	@Override
//	public String toString() {
//		return "Group [memberMap=" + memberMap + "]";
//	}
}
