package chap19_multiThread.clazz;

public class PrintNumWithoutSync {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	public void printNum1() {		
		try {
			Thread.sleep(300);
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		for(int i = 1; i <= this.num; i++) {
			System.out.println(i);
		}
	}
	
	public void printNum2() {		
		for(int i = this.num; i <= this.num * 2; i++) {
			System.out.println(i);
		}
	}
}
