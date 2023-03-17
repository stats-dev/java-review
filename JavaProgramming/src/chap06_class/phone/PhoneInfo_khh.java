package chap06_class.phone;

import java.util.Scanner;

public class PhoneInfo_khh {
	//이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNumber = new String[100];
	
	Scanner sc = new Scanner(System.in);
	
	//배열의 현재 인덱스를 담고 있을 변수
	int index = 0;
	
	//전달받은 이름과 전하번호를 저장하는 메소드
	//insertPhoneNum
	public void insertPhoneNum(String name, String number) {
		this.name[index] = name;
		this.phoneNumber[index] = number;
		
		index++;
		
	}
	
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드(저장된 만큼만 나올것)
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 11111111111
	//	  이름 : 홍길동2, 전화번호 : 22222222222
	//	  이름 : 홍길동3, 전화번호 : 33333333333
	//	  이름 : 홍길동4, 전화번호 : 44444444444
	public void printAllPhoneNum() {
		
		for(int i=0;i<name.length;i++) {
			if(name[i] != null) 
				System.out.println("이름 : " + name[i] + ", " + "전화번호 : " + phoneNumber[i]);
		}

	}
		
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	//ex) 이름 : 홍길동3, 전화번호 : 33333333333
	//----------연락처 목록---------
//	1. 정보 입력
//	2. 모든 정보 출력
//	3. 인덱스로 정보 검색
//	4. 종료
	
	public void printPhoneNum() {
		while(true) {
			System.out.print("조회하고 싶은 번호를 입력하세요.(1~100)");
			int number = sc.nextInt();
			if(number > 0) {
				
				if(name[number - 1] != null) {
					System.out.println("이름 : " + name[number - 1] + ", " + "전화번호 : " + phoneNumber[number - 1]);
					break;

				} else {
					System.out.println("해당 번호의 정보가 존재하지 않습니다.");
					continue;
				}
				
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			
		}
		
				
	}
	
	public void end() {
		while(true) {
			System.out.println("계속하시겠습니까? (0: 종료, 1: 계속)");
			
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("종료되었습니다.");
				break;
			} else if(input == 1) {
				printPhoneNum();
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
		}
		sc.close();

	}
	
	
	public static void main(String args[]) {
		PhoneInfo_khh phone = new PhoneInfo_khh();
		
		System.out.println("1. 정보 입력");
		phone.insertPhoneNum("홍길동1", "11111111111");
		phone.insertPhoneNum("홍길동2", "22222222222");
		phone.insertPhoneNum("홍길동3", "33333333333");
		phone.insertPhoneNum("홍길동4", "44444444444");
		
		System.out.println("2. 모든 정보 출력");
		phone.printAllPhoneNum();
		
		System.out.println("3. 인덱스로 정보 검색");
		phone.printPhoneNum();
		
		System.out.println("4. 종료");
		phone.end();
	}

}
