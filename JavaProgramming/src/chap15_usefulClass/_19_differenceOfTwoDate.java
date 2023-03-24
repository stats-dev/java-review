package chap15_usefulClass;

import java.util.Calendar;
import java.sql.*; // SQL에도 Date 관련 메소드가 좀 있습니다.
//LocalDate

public class _19_differenceOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2011, 2, 11);
		
		//getTimeInMillis() : long 타입으로 지정된 날짜를 밀리세컨드로 리턴
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지 " +
							(diff / 1000) + "초가 지났습니다."); //이러면 초가 된다.
		
		System.out.println("d2부터 d1까지 " +
				(diff / (1000 * 60)) + "분이 지났습니다."); 

		System.out.println("d2부터 d1까지 " +
				(diff / (1000 * 60 * 60)) + "시간이 지났습니다.");

		System.out.println("d2부터 d1까지 " +
				(diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다.");
		
		System.out.println("d2부터 d1까지 " +
				(diff / ((long) 1000 * 60 * 60 * 24 * 30)) + "달이 지났습니다."); // long 범위 벗어나면 -값으로 나올 수 있음. 하나만 long으로 지정하면 된다.
		
		System.out.println("d2부터 d1까지 " +
				(diff / ((long) 1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다."); // long 범위 벗어나면 -값으로 나올 수 있음. 하나만 long으로 지정하면 된다.
		
		
		System.out.println("몇 년 몇 달 며칠 몇 시간 몇분 몇초 지났습니다.");
		
				
		long year = diff / ((long) 1000 * 60 * 60 * 24 * 30 * 12);
		diff %= ((long) 1000 * 60 * 60 * 24 * 30 * 12);
		long month = diff / ((long) 1000 * 60 * 60 * 24 * 30);
		diff %= ((long) 1000 * 60 * 60 * 24 * 30);
		long date = diff / ((long) 1000 * 60 * 60 * 24);
		diff %= ((long) 1000 * 60 * 60 * 24);
		long hour = diff / ((long) 1000 * 60 * 60);
		diff %= ((long) 1000 * 60 * 60);
		long minute = diff / ((long)1000 * 60);
		diff %= ((long) 1000 * 60);
		long second = diff / (long) 1000;
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초 지났습니다.");
		
		
//		int[] timeArr = {1000,60,60,24,30,12};
//		long[] timeResults = new long[6];
//		//long[] div = new long[6];
//		
//		long all = 1;
//		
//		for(int i=0;i<timeArr.length;i++) {
//			all *= timeArr[i];
//		}
//		
//		for(int j=0;j<timeArr.length;j++) {
//			timeResults[j] = diff / all;
//			diff %= all;
//			all /= timeArr[timeArr.length-j - 1];
//			System.out.print(timeResults[j] + " " + all+ " " + diff);
//		}
//		
//		
////		System.out.println();
////		System.out.println(timeResults[5] + "년 " + timeResults[4] + "달 " +
////							timeResults[4] + "일 " + timeResults[3] + "시간 " +
////							timeResults[2] + "분 " + timeResults[1] + "초 지났습니다.");
//		
//		
//		System.out.println("-----------------");
//		
////		

		
		

	}

}
