package chap98_homework.nc230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import chap98_homework.nc230328.clazz.Group;
import chap98_homework.nc230328.clazz.GroupA;
import chap98_homework.nc230328.clazz.GroupB;
import chap98_homework.nc230328.clazz.GroupC;
import chap98_homework.nc230328.clazz.GroupD;
import chap98_homework.nc230328.clazz.GroupE;
import chap98_homework.nc230328.clazz.GroupF;
import chap98_homework.nc230328.clazz.StudyGroup;

public class _03_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyGroup<Group> stGroup = new StudyGroup<Group>(); //그룹 타입의 스터디그룹을 만든다.
		
		List<Group> groupList = new ArrayList<Group>(); // 그룹 리스트 담기위한 리스트도 만들어준다.
		
		int idx = 1; // 이름 담아줄 메소드 제작
		for(int j = 0; j < 6; j++) { //6개 조 돌리기.
			Map<String, String> memberMap = 
							new HashMap<String, String>(); //각 조마다 map 생성하도록 만든다.
			
			for(int i = 0; i < 5; i++) { // 조원 생성은 5명
				if(i == 0) { // 그냥 0번째가 조장으로 지정이 된다.
					memberMap.put(String.valueOf(idx++), "조장"); //idx가 1부터 증가하도록해서 조 순서가 나온다.
				} else {
					memberMap.put(String.valueOf(idx++), "조원");
				}
			}
			
			Group gr = getGroupInstance(j, memberMap);
			groupList.add(gr);
		}
		stGroup.settList(groupList); //그룹리스트도 setter를 통해 스터디그룹에 접근시켜 설정한다.
		
		List<Entry<String, String>> entList = stGroup.getCaptins(); // 리스트로 변환 조장 리스트이다.
		
		System.out.println(entList); // 하나씩 출력한다.
	}
	
	//각 그룹 인스턴스 만드는 친구.
	public static Group getGroupInstance(int idx, Map<String, String> map) {
		Group gr = new Group();
		
		switch(idx) {
			case 0 :
				gr = new GroupA(map);
				break;
			case 1 :
				gr = new GroupB(map);
				break;
			case 2 :
				gr = new GroupC(map);
				break;
			case 3 :
				gr = new GroupD(map);
				break;
			case 4 :
				gr = new GroupE(map);
				break;
			case 5 :
				gr = new GroupF(map);
				break;
			default :
				gr = null;
				break;
		}
		
		return gr;
	}
}
