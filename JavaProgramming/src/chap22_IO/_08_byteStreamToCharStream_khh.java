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
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class _08_byteStreamToCharStream_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		 
		try {
			InputStream is = new FileInputStream("D:/lecture/Java/ip01.txt");
			
			Reader reader = new InputStreamReader(is, "UTF-8");
			
			char[] chArr = new char[255];
			
			while(true) {
				int cnt = reader.read(chArr);
				
				if(cnt == -1) {
					break;
				}
				
				for(int i = 0; i < cnt; i++) {
					System.out.println(chArr);
				}
			}
			
			
			reader.close();
			
			return reader.toString();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
		

		
	}
	

}
