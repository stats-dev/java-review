package chap19_multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _16_threadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		PrintThread t1 = new PrintThread();
		PrintThread t2 = new PrintThread();
		
		t1.settName("스레드 1번");
		t2.settName("스레드 2번");
		
		for(int i = 0; i < 10; i++) {
			es.execute(t1);
			es.execute(t2);
			
			if(i == 9) {
				es.shutdownNow();
				break;
			}
		}

	}

}


//문구 띄워주는 친구
class PrintThread extends Thread {
	private String tName;
	
	
	
	public void settName(String tName) {
		this.tName = tName;
	}

	@Override
	public void run() {
		System.out.println(tName + " 작업 진행");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println(tName + " shutdownNow() 호출");
			
		}
		
	}
}