package chap10_abstraction.product;

public class EngAcademy extends Academy{
	
	public int numClass;
	public int numStudent;
	public int numTeacher;
	public int numSubject;

	public void teach() {
		System.out.println("나는" + numStudent + "명의 학생을 가르친다.");
		
	}
	
	public void dohw(){
		System.out.println("나는" + numStudent + "명의 학생을 가르친다.");
		
	}
	
	public void brekt(){
		System.out.println("나는" + numStudent + "명의 학생을 가르친다.");
		
	}
		
	public void attend(){
		System.out.println("나는" + numStudent + "명의 학생을 가르친다.");
		
	}


	

}
