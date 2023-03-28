package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup<T> {
	private List<T> groupList = 
						new ArrayList<T>();

	public List<T> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<T> groupList) {
		this.groupList = groupList;
	}
	
	public T getGroup(int index) {
		return groupList.get(index);
	}
}
