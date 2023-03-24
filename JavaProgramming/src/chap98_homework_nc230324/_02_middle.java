package chap98_homework_nc230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.(yyyy-MM-dd 형식)");
		String dates = sc.next();

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(sdf.parse(dates)));
		
////		2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
////		   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.


		String[] daysArr = {"", "일요일" , "월요일" ,"화요일", "수요일" ,"목요일", "금요일", "토요일"};	
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(dates));

		System.out.println("요일 : " + daysArr[cal.get(Calendar.DAY_OF_WEEK)]);

				
		sc.close();
//		
		
//		3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.		
		
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d1.set(2023, 3-1, 15, 20, 31, 45);
		d2.set(2021, 7-1, 8, 11, 58, 4);
		
//		Date d3 = new Date(d1.getTimeInMillis());
		
		System.out.println(d2.getTimeInMillis());
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		
		long hour = diff / ((long) 1000 * 60 * 60);
		diff %= ((long) 1000 * 60 * 60);
		long minute = diff / ((long)1000 * 60);
		diff %= ((long) 1000 * 60);
		long second = diff / (long) 1000;
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 차이가 납니다.");
//		System.out.println(14768 / (24 * 30));
//		SimpleDateFormat sdf2 =
//		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


//System.out.println(sdf2.format(d3));
		
		
		
		
	}

}
