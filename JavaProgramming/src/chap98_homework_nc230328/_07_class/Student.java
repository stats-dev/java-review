package chap98_homework_nc230328._07_class;

public class Student {
//	1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와
//	학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
	
	//멤버변수
	public String name;
	public int code;
	public String department;
	
	public void student(String name, int code, String department) {
		this.name = name;
		this.code = code;
		this.department = department;	
	}
	
	public void printStudentInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학번 : " + code);
		System.out.println("학과 : " + department);
	}
	
	

}
