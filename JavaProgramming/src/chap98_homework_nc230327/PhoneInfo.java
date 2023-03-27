//package chap98_homework_nc230327;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class PhoneInfo {
//	
//
////3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
////
////	String[] name = new String[100];
////	String[] phoneNum = new String[100]; -> 이걸 하나로 만들기!
//	
////	String[] name = new String[100];
////	String[] phoneNum = new String[100];
//
////	List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
////	
////	for(Car c : carList) {
////		Map<String, Object> map = new HashMap<String, Object>(); //생성되고 사라지기를 반복하게 된다.
////		
////		map.put("company", c.company);
////		map.put("model", c.model);
////		map.put("color", c.color);
////		map.put("price", c.price);
////		
////		mapList.add(map);
////		
////	}
////	
////	for(int i = 0; i < mapList.size(); i++) {
////		System.out.println(mapList.get(i));
////	}
//
//	String name = "";
//	String phoneNum = "";
//	
//	List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
//	
//			
//	int index = 0;
//	
//	public void insertPhoneInfo(String name, String number) {
//		//이름과 번호를 배열에 저장. 0번 부터 하나씩 저장.
//		this.name = name; // this는 객체를 뜻한다. 위에 있는 멤버 변수(name, phoneNum)을 직접 지정할 수 있다.
//		this.phoneNum = number; // 굉장히 편리하니 기억하자. 중복이 안뜬다. 좋네.
//		mapList.add(name, number);
////		index++; // 인덱스 하나씩 올리기.
//	}
//
//	//모든 PhoneInfo 출력
//	public void printAllPhoneInfo() {
//		for(int i = 0; i < mapList.size(); i++) {
//			if(name[i] != null) { // null이 되면 저장이 안된 것임. 그 전까지만 저장이 된 것이라 보면 된다.
//				System.out.print("이름 : " + name[i] + ", 번호 : " + phoneNum[i] + "\n");
//			}
//		}
//	}
//	
//	//번호에 해당하는 이름과 번호 출력
//	public void printPhoneInfo(int index) {
//		if(name[index - 1] != null) { //0부터 99까지 저장해주고, null 아닌 친구만 이름, 번호 출력한다.
//			System.out.print("이름 : " + name[index - 1] + ", 번호 : " + phoneNum[index - 1] + "\n");
//		} else {
//			System.out.println("해당 번호로 저장된 정보가 없습니다."); // null이면 해당 정보 저장된 게 없다고 볼 수있다.
//		}
//	}
//}
