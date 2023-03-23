package chap98_homework_nc230321;

import java.util.Scanner;

import chap98_homework_nc230321.company.DayJob;
import chap98_homework_nc230321.company.Employee;
import chap98_homework_nc230321.company.FullTime;
import chap98_homework_nc230321.company.PartTime;

public class _01_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary; //월급
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			System.out.println("\"*** 메뉴 선택 ***\"\r\n"
					+ "		\"1. 정규직 저장\"\r\n"
					+ "		\"2. 임시직 저장\"\r\n"
					+ "		\"3. 계약직 저장\"\r\n"
					+ "		\"4. 전체 정보 출력\"\r\n"
					+ "		\"5. 월급 계산 출력\"\r\n"
					+ "		\"6. 프로그램 종료\"");
			Employee[] ft1 = new Employee[100];
			Employee ft = new FullTime();
			Employee dj = new DayJob();
			Employee pt = new PartTime();
			
			
			
			switch(menu) {
			case 1: {
				System.out.println("1. 정규직 저장");
				ft.eno = "F-123"; //사번
				ft.name = "홍길동";
				ft.pay = 1000000;
			salary = ft.getMonthPay();
//			ft.showEmployeeInfo();
				continue;
			}
			case 2: {
				System.out.println("2. 임시직 저장");
				dj.eno = "D-123"; //사번
				dj.name = "행복한";
				dj.pay = 1000000;
//			salary = dj.getMonthPay();
//			dj.showEmployeeInfo(salary);
				continue;
			}
			case 3: {
				System.out.println("2. 계약직 저장");
				pt.eno = "P-123"; //사번
				pt.name = "행복한";
				pt.pay = 1000000;
//			salary = pt.getMonthPay();
//			pt.showEmployeeInfo(salary);
				continue;
			}
			case 4: {
				System.out.println("4. 전체 정보 출력");
				ft.showEmployeeInfo();
				dj.showEmployeeInfo();
				pt.showEmployeeInfo();
				continue;
				
			}
			case 5: {
				System.out.println("5. 월급 계산 출력");
				ft.showEmployeeInfo();
				System.out.println("정규직이므로 월급은 " + ft.getMonthPay() + "입니다.");
				dj.showEmployeeInfo();
				System.out.println("임시직이므로 월급은 " + dj.getMonthPay() + "입니다.");
				pt.showEmployeeInfo();
				System.out.println("계약직이므로 월급은 " + pt.getMonthPay() + "입니다.");
				continue;
				
			}
			case 6:{
				System.out.println("프로그램 종료");
				break;
				
			}
			default:
				break;
			}
			
			
		}
		


	}

}
