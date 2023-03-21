package chap98_homework_nc230321.company;

public abstract class Employee {
	// 생성자
	public String eno; //사번
	public String name; //이름
	public int pay; //급여
	
	
	public abstract double getMonthPay();
	public void showEmployeeInfo() {
		System.out.println("사번: " + eno + "\n" + "이름: " + name + "\n" + "급여: " + pay + "입니다.");
	}
	
	

}
