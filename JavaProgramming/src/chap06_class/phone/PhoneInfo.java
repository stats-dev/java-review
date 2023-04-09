package chap06_class.phone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//import chap06_class.car.Car;

public class PhoneInfo {
	//웬만하면, private로 만드는게 좋다.
	//이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	
	//배열의 현재 인덱스를 담고 있을 변수
	int currentIndex = 0;

	
	
	Map<String, String> infoMap = new HashMap<String, String>();
	

	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	public String insertPhoneNum(String name, String PhoneNum) { 	//메소드 값 전달하려면, 매개변수로 전달해야한다.
		this.name[currentIndex] = name;
		this.phoneNum[currentIndex] = PhoneNum;
		currentIndex++; // 바로 다음 인덱스로 보낼 수 있다.
		
		
		String str = "";
		str = read();
		str = str + "\n" + infoMap.put(name, PhoneNum);
		

		return str; // 이건 옵션, 안하고 public String -> public void로 처리할 수도 있습니다.
	}
	
	//실제로 파일스트림 저장하는 메소드
	public String savePhoneNum() { 
//		this.name[currentIndex] = name;
//		this.phoneNum[currentIndex] = PhoneNum;
//		currentIndex++; // 바로 다음 인덱스로 보낼 수 있다.
		
		OutputStream os;
		try {
			os = new FileOutputStream("D:/lecture/Java/phoneInfo.txt", true);
			
			Writer writer = new OutputStreamWriter(os, "UTF-8"); //보조스트림 사용
			
			
							
			for(Entry<String, String> ent : infoMap.entrySet()) {
				writer.write("이름 : " + ent.getKey() +", 전화번호 : " + ent.getValue() + "\n");				
			}
			writer.flush();
			writer.close();
			
			
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 

		return "저장되었습니다.";
		
	}
	
	
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 11111111111
	//    이름 : 홍길동2, 전화번호 : 22222222222
	//    이름 : 홍길동3, 전화번호 : 33333333333
	//    이름 : 홍길동4, 전화번호 : 44444444444
	public void printAllPhoneNum() {
		
		String str = "";
		str = read();
		
		System.out.print(str);
		
		for(int i = 0; i < currentIndex; i++) { //아 위에서 저장된 인덱스 값만 넣으면 이걸로 바로 해결 가능..
			System.out.println("이름 : " + name[i] +
					", 전화번호 : " + phoneNum[i]);
		}
//		return str;
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
	
public static String read() {
		
		String returnStr = ""; //리턴될 친구를 만든다.
		
		//입력
		try {
			InputStream is = new FileInputStream("D:/lecture/Java/phoneInfo.txt");
			
			try (//byte를 문자스트림으로 변환
			Reader reader = new InputStreamReader(is)) {
				char[] chArr = new char[4096];
				
				
				
				while(true) {
					int cnt = reader.read(chArr); //배열에 저장된 문자열 개수를 cnt로 받는다.
					
					if(cnt == -1) {
						break;
					}
					
					for(int i = 0; i < cnt; i++) { //선언한 빈칸에 캐릭터가 쌓이도록 바꾼다.
						returnStr = returnStr +
								String.valueOf(chArr[i]); //char 문자 하나만 안되고 더해주기.
					}
					
//				returnStr = new String(chArr); //스트링으로 변환해준다.? 강제형변환 new!
				}
			}
			
			
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 
		
		return returnStr;


		
	}
	
}
