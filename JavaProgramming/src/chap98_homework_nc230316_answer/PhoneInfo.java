package chap98_homework_nc230316_answer;

public class PhoneInfo {
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	
	int index = 0;
	
	public void insertPhoneInfo(String name, String number) {
		//이름과 번호를 배열에 저장. 0번 부터 하나씩 저장.
		this.name[index] = name; // this는 객체를 뜻한다. 위에 있는 멤버 변수(name, phoneNum)을 직접 지정할 수 있다.
		this.phoneNum[index] = number; // 굉장히 편리하니 기억하자. 중복이 안뜬다. 좋네.
		index++; // 인덱스 하나씩 올리기.
	}

	//모든 PhoneInfo 출력
	public void printAllPhoneInfo() {
		for(int i = 0; i < name.length; i++) {
			if(name[i] != null) { // null이 되면 저장이 안된 것임. 그 전까지만 저장이 된 것이라 보면 된다.
				System.out.print("이름 : " + name[i] + ", 번호 : " + phoneNum[i] + "\n");
			}
		}
	}
	
	//번호에 해당하는 이름과 번호 출력
	public void printPhoneInfo(int index) {
		if(name[index - 1] != null) { //0부터 99까지 저장해주고, null 아닌 친구만 이름, 번호 출력한다.
			System.out.print("이름 : " + name[index - 1] + ", 번호 : " + phoneNum[index - 1] + "\n");
		} else {
			System.out.println("해당 번호로 저장된 정보가 없습니다."); // null이면 해당 정보 저장된 게 없다고 볼 수있다.
		}
	}
}
