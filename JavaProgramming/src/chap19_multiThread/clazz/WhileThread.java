package chap19_multiThread.clazz;

public class WhileThread extends Thread{
	private boolean stop = false;

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		//후처리를 하기 위해 stop 메소드(강제종료)는 없어졌다.
		while(!stop) {
			System.out.println("스레드 실행됨");
		}
		System.out.println("스레드 종료");
	}

}
