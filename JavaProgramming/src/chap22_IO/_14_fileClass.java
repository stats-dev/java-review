package chap22_IO;

import java.io.File;
import java.io.IOException;

public class _14_fileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//1. 파일객체 생성
		File newDirectory = new File("D:/lecture/Java/Test");
		
		File newFile = new File("D:/lecture/Java/Test/fileEx01.txt");
		
		//2. 파일, 폴더 생성
		if(!newDirectory.exists()) {
			newDirectory.mkdir(); //일단 Test 폴더만 만든다.
		}
		
		if(!newFile.exists()) {
				newFile.createNewFile();
		}
		
		
		//3. 파일 객체 생성
		File directory = new File("D:/lecture/Java");
		
		File deleteFile = new File("D:/lecture/Java/name.txt");
		
		File[] fileArr = directory.listFiles();
		
		for(File f : fileArr) {
			System.out.println(f.getName()); // 파일명 하나씩 가져온다.
		}
		System.out.println("----------중간선-------------");
		
		boolean isDeleted = deleteFile.delete(); //지워지는지 boolean 확인.
		
		if(isDeleted) {
			System.out.println("파일이 정상적으로 삭제되었습니다.");
		} else {
			System.out.println("파일 삭제에 실패했습니다.");
		}
		

		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
