package chap98_homework_nc230321.company;

public class FullTime extends Employee {

	int bonus = 1000;
	int salary;
	
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		salary = (pay/12) + (bonus/12);
		return salary;
		
	}
	
}
