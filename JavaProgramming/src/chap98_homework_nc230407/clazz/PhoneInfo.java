package chap98_homework_nc230407.clazz;

public class PhoneInfo {
	//웬만하면, private로 만드는게 좋다.
	//이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	
	//배열의 현재 인덱스를 담고 있을 변수
	int currentIndex = 0;
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	public void insertPhoneNum(String name, String PhoneNum) { 	//메소드 값 전달하려면, 매개변수로 전달해야한다.
		this.name[currentIndex] = name;
		this.phoneNum[currentIndex] = PhoneNum;
		currentIndex++; // 바로 다음 인덱스로 보낼 수 있다.
		
		//return "저장되었습니다."; // 이건 옵션, 안하고 public String -> public void로 처리할 수도 있습니다.
	}
	
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 11111111111
	//    이름 : 홍길동2, 전화번호 : 22222222222
	//    이름 : 홍길동3, 전화번호 : 33333333333
	//    이름 : 홍길동4, 전화번호 : 44444444444
	public void printAllPhoneNum() {
		for(int i = 0; i < currentIndex; i++) { //아 위에서 저장된 인덱스 값만 넣으면 이걸로 바로 해결 가능..
			System.out.println("이름 : " + name[i] +
					", 전화번호 : " + phoneNum[i]);
		}
	}
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	//ex) 이름 : 홍길동3, 전화번호 : 33333333333
	public void printPhoneNum(int index) {
		if(name[index - 1] == null) { //0부터 99이므로 - 1을 넣어주었다..? 정보가 없으면 없다고 표기함.
			System.out.println("해당 번호의 정보가 존재하지 않습니다.");
		} else {
			System.out.println("이름 : " + name[index - 1] + // 있으면 해당 이름, 번호가 출력되게 한다.
					", 전화번호 : " + phoneNum[index - 1]);
		}
	}
}
