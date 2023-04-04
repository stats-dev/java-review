package chap98_homework_nc230404.generic;

import java.util.ArrayList;
import java.util.List;

public class TList<T> {
//	2. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 
	//splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을
//    구현하세요.(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)

	private List<T> List;
	
	public TList() {
		List = new ArrayList<T>();
	}

    public void add(T item) {
        List.add(item);
    }
	
	public List<T> getList() {
		return List;
	}
	
	public List<T>[] splitList() {
		List<T>[] result = new List[2]; //반반이니 두개의 배열을 생성
		int size = List.size();
		int half = (size + 1) / 2; //반으로 나눈다. 홀수면 정수, 짝수면 1개 손해가 난다.
		
		result[0] = new ArrayList<>(List.subList(0, half));
		result[1] = new ArrayList<>(List.subList(half, size));
		
		return result;
	}
	
	

}
