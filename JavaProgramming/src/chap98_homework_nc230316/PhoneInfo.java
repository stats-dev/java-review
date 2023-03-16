package chap98_homework_nc230316;

import java.util.Scanner;

public class PhoneInfo {
	
	   String[] name = new String[100];
	   String[] phoneNum = new String[100];

	   int i = 0;

	   public void insertPhoneInfo(String name1, String number) {
		//이름과 번호를 배열에 저장
			Scanner sc = new Scanner(System.in);
			
			for(i=0;i<name.length;i++) {
				name[i] = sc.next();
				phoneNum[i] = sc.next();
			}
			
	   }

	   //모든 PhoneInfo 출력
	   public void printAllPhoneInfo() {
		   
			for(int i=1;i<name.length;i++) {
				System.out.println("이름: " + name[i] + "번호: " + phoneNum[i]);
				
			}

	   }

	   //번호에 해당하는 이름과 번호 출력
	    public void printPhoneInfo(int index) {
	    	
			for(int i=1;i<name.length;i++) {
				if(index == i) {
					System.out.println("이름: " + name[i] + "번호: " + phoneNum[i]);
				} else {
					continue;
				}
				
			}

	   }

}
