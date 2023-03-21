package chap10_abstraction.product;

public abstract class Academy {

	//속성은 이미 추상이 되어 있는 것이다.
	public int numClass;
	public int numStudent;
	public int numTeacher;
	public int numSubject;
	
	//기능에만 추상이 들어가야 한다.
	public abstract void teach();
	
	public abstract void dohw();
	
	public abstract void brekt();
		
	public abstract void attend();
	
	
	
}
