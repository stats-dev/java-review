package chap98_homework_nc230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _03_advance {

	public static void main(String[] args) throws ParseException {
//		// TODO Auto-generated method stub
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루 씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
		
		Calendar cal = Calendar.getInstance();
		cal.set(2001, 12-1, 19);
				
		
		for(int i =0;i<=20;i++) {
			if(isLeap(cal.get(Calendar.YEAR))) {
				cal.add(Calendar.DATE, 1);
			} cal.add(Calendar.YEAR, 1);	
		}
		
		Date dd = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(dd));
		
		
//		2. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		
//		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("aabbcdeffaaaaynguuuuuu"); // 8글자
		int len = sb1.capacity() - sb1.length();
		for(int i =0; i<len;i++) {
			if(sb1.charAt(i) == sb1.charAt(i+1)) {
				sb1.delete(i,i+1);
			} else {
				continue;
			}
		}
		
		System.out.println(sb1);
		
//		sb1.append(sc.next());
		

//		
//		3. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 날짜를 입력하세요. (yyyy-MM-dd 형식)");
		System.out.println("첫번째 날짜: ");
		String d1 = sc.next();
		System.out.println("두번째 날짜: ");
		String d2 = sc.next();
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
//		String d1 = "2023-01-29";
//		String d2 = "2023-02-05";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf1.parse(d1));
//		System.out.println(sdf1.parse(d2));
		
		cal1.setTime(sdf1.parse(d1));
		cal2.setTime(sdf1.parse(d2));
		
		long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		long date = diff / ((long) 1000 * 60 * 60 * 24);


		Date d3 = new Date(cal1.getTimeInMillis());
		System.out.println(sdf1.format(d3));
		
		for(int i = 0;i<date;i++) {
			cal1.add(Calendar.DATE, 1);
			Date d4 = new Date(cal1.getTimeInMillis());
			System.out.println(sdf1.format(d4));
		}
		
		sc.close();
		
		
	}
	
	
	public static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
		
	
	
	

}
