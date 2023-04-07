package chap22_IO;

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

public class _08_byteStreamToCharStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write("aaa"); //write 먼저 호출
//		write("bbb");
		String str = read();
		System.out.println(str);
		

	}
	
	public static void write(String str) {
		//throws는? 에러 그냥 다음 호출되는 곳으로 전달하겠다. (후처리 못함) ex) throws FileNotFoundException
		//try-catch : 후처리까지 다 끝내겠다.
		try {
			OutputStream os = new FileOutputStream("D:/lecture/Java/hp01.txt");
			
			//OutputStreamWriter룰 이용해서
			//바이트스트림 -> 문자스트림으로 변환
			Writer writer = new OutputStreamWriter(os, "UTF-8"); // 보조스트림이 붙어서 문자처럼 쓸 수 있게 함. CharSet도 utf8 넣어주기!
			
			
			writer.write(str);
//			writer.append('\r');
//			writer.append('\n');
			
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
		} //final도 붙일 수 있음.

	}
	
	
	//InputStreamReader를 이용해서
	//바이트스트림 -> 문자스트림으로 변환해주는 메소드
	public static String read() {
		
		String returnStr = ""; //리턴될 친구를 만든다.
		
		//입력
		try {
			InputStream is = new FileInputStream("D:/lecture/Java/hp01.txt");
			
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
