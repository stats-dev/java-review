package chap19_multiThread.clazz;

public class PrintNumWithWaitNotify_khh {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	//동기화 메소드
	public synchronized void printNum1(int num) {
		this.setNum(num);
		
		for(int i = 1; i <= this.num; i+=2) {
			System.out.println("스레드 1 - " + i);
			notify(); //다른 스레드를 실행 대기 상태로 변경
					  //wait()가 호출되어 일시 정지 상태로 변경되기 전에 호출해야 된다.
			
			try {
				wait(); // 자신을 일시 정지 상태로 변경
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public synchronized void printNum2(int num) {
		this.setNum(num);
		
		for(int i = 2; i <= this.num; i+=2) {
			System.out.println("스레드 2 - " + i);
			
			notify(); //다른 스레드를 실행 대기 상태로 변경
			  //wait()가 호출되어 일시 정지 상태로 변경되기 전에 호출해야 된다.
	
			try {
				wait(); // 자신을 일시 정지 상태로 변경
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}

		}
	}
}
