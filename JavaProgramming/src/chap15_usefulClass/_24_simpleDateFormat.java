package chap15_usefulClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _24_simpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(); //java.sql은 util에 상속받은 것이라서 두 가지 다 사용가능하다.
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
		
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		//23년 03월 24일
//		2023-03-24 15:35:50
		
		

	}

}
