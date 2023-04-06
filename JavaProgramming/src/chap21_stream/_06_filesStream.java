package chap21_stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _06_filesStream {

	public static void main(String[] args) {//throws Exception //3. 이렇게도 가능 다 던지기{
		// TODO Auto-generated method stub
		// hyundaicar.txt 의 경로(Path) 객체 얻기
		try {
			Path path = Paths.get(_06_filesStream.class.getResource("hyundaicar.txt").toURI());
			//Files.lines() => 텍스트 파일을 행으로 분리해서
			//					행들의 스트림을 만들어준다.{"model":"아반떼", "price":1500}
			
			Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
			
			fileStream.forEach(l -> System.out.println(l)); //한줄 가져올 거 l
			
			
		} catch (URISyntaxException ue) {
			// TODO: handle exception
			ue.printStackTrace(); // Paths에서 URI 문법 에러
		} catch (IOException ie) {
			ie.printStackTrace(); // Files의 IO input & output 에러
		} catch (Exception e) { //마지막에는 제일 큰 에러를 모두 포함하게 하여 혹시나 하는 에러조차 싸그리 해결한다.
			// TODO: handle exception
			e.printStackTrace(); 
		}
//		} catch (Exception e) { //모든 예외가 한번에 처리할 수 있도록 한다. URISyntaxException & IOException error 한방에!
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
