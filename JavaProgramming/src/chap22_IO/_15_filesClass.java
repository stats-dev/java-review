package chap22_IO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _15_filesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = "이름 : 홍길동\n번호 : 01011111111";
			
			//1. Path객체 생성
			Path path = Paths.get("D:", "lecture", "Java", "filesEx01.txt");
			
			//2. 파일 생성 및 데이터 저장
			Files.writeString(path, data, Charset.forName("UTF-8"));
			
			//3. 파일 정보 출력
			//.txt => text/plain
			//.jpg, .jpeg => image/jpeg
			//.gif => image/gif
			System.out.println("파일 정보 : " + Files.probeContentType(path));
			//byte 단위로 파일 크기(가져옴)
			System.out.println("파일크기(바이트) : " + Files.size(path)); // 파일 크기
			
			//4. 파일 읽기
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
			
			
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
