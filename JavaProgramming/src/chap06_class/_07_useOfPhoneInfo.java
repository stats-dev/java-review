package chap06_class;

import java.util.Scanner;

import chap06_class.phone.PhoneInfo;

public class _07_useOfPhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo phoneInfo = new PhoneInfo();
		
		Scanner sc = new Scanner(System.in);
		
		//switch~case문에서 break; 시 switch~case만 종료되기
		//때문에 while문을 종료시킬 플래그
		boolean isExit = false;
		
		while(true) {
			System.out.println("-----연락처 목록-----");
			System.out.println("1. 정보 입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 인덱스로 정보 검색");
			System.out.println("4. 종료");
			
			int userInput = sc.nextInt();
			
			switch(userInput) {
				case 1:
					System.out.print("이름을 입력하세요. : ");
					String name = sc.next(); // next를 넣어줘야 한다. 다음값 입력상태로 그대로 넘어가게 하기 위함이다?
					sc.nextLine(); // 엔터값을 제거한다.
					System.out.print("번호를 입력하세요. : ");
					String phoneNum = sc.nextLine();
					
					phoneInfo.insertPhoneNum(name, phoneNum);
					break;
				case 2:
					phoneInfo.printAllPhoneNum();
					break;
				case 3:
					while(true) { //while 문으로 한번 감싸줌.
						System.out.print("조회하고 싶은 번호를 입력하세요.(1~100)");
						int index = sc.nextInt();
						
						if(index < 1 || index > 100) {
							System.out.println("1~100 안의 값을 입력하세요.");
							continue;
						} else {
							phoneInfo.printPhoneNum(index); //이 방법을 호출해서, 사용자 입력한 인덱스 번호 출력하도록 한다.
							break; // 이걸로 while 문을 끝낸다.
						}
					}
					break; // case만 빠져나간다.
				case 4:
					isExit = true; //4번 누르면 종료가 된다.
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					continue;
			}
			
			if(isExit) {
				break;
			}
		}
		
		sc.close();
	}

}
