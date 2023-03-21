package chap98_homework_nc230321.company;

//계약직
public class PartTime extends Employee {

	int workDay=300; // 300일 하심.
	int salary;

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		salary = pay * workDay;
		return salary;
		
		
	}

}
