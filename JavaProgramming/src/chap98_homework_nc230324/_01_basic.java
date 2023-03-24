package chap98_homework_nc230324;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class _01_basic {

	
	public static void main(String[] args) {
		
//		Calendar 객체를 오늘날짜로 생성하세요.
		
		
		Calendar cal = Calendar.getInstance();
		
//		1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		cal.set(2020, 4-1, 8);
		Date d1 = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println(sdf.format(d1));
		

//		Calendar 객체를 오늘날짜로 생성하세요.
//
//
//		2. 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요. (simpledateformat)
//		
		
		Calendar cal1 = Calendar.getInstance();
		
//		1. 오늘날짜를 2023-03-24 형식으로 출력하세요. (Simpledateformat)
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		d1 = new Date(cal1.getTimeInMillis());
		System.out.println(sdf1.format(d1));

		
	}
	
}
