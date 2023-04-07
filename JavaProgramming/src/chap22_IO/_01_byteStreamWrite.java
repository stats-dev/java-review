package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _01_byteStreamWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("D:/lecture/Java/ex01.txt");
			
//			OutputStreamWriter osw = new OutputStreamWriter(os, Charset.forName("UTF-8")); //캐릭터셋을 맞춘다.
			
			//byte 단위로 되어서 깨진것 처럼 보이는 것이다..
			
			//1. byte를 1byte씩 출력
			byte num1 = 10;
			byte num2 = 20;
			byte num3 = 30;
			
			//출력
			os.write(num1);
			os.write(num2);
			os.write(num3);
			
			
			//1-1. 바이트 배열로 출력
			
			//2. 버퍼 비워주기
			os.flush();
			
			//3. 스트림 메모리에서 해제
			os.close();
			
		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println(ioe.getMessage());
		}

	}

}
