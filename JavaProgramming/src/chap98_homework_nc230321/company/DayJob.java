package chap98_homework_nc230321.company;

// 임시직
public class DayJob extends Employee{
	

	int salary;

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		salary = pay / 12;
		return salary;
		
	}

}
