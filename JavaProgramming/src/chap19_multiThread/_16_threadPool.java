package chap19_multiThread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _16_threadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = 
				Executors.newFixedThreadPool(5);
		
		//Thread-0
		PrintThread t1 = new PrintThread();
		t1.settName(t1.getName());
		
		//스레드를 5개까지 가지는 풀
		//execute(스레드) : 스레드를 풀에 저장
		//				(새로 생성 혹은 풀에 있는 스레드를 이용해서)
		// 0~4: 5개 저장
		// 5가 들어오면 1~5 5개 저장
		// 0~9: 스레드를 각각 1회씩 실행
		es.execute(t1);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdownNow();
		//PrintThread t2 = new PrintThread();
		
		//t2.settName("스레드 2번");
		
//		for(int i = 0; i < 10; i++) {
//			t1.settName(t1.getName());
//			es.execute(t1);
//			//es.execute(t2);
//			
//			if(i == 9) {
//				es.shutdownNow();
//				return;
//			}
//		}
//		List<Runnable> rList = 
//					es.shutdownNow();
//		
//		for(Runnable r : rList) {
//			System.out.println(r);
//		}
	}

}

class PrintThread extends Thread {
	private String tName;
	
	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettName() {
		return tName;
	}

	@Override
	public void run() {
		while(true) { //무한루프 돌때, 
		System.out.println(tName + " 작업 진행");
		
			try {
				Thread.sleep(100); // 100ms 마다 작성하다가, catch에서 리턴메소드로 마무리하면 된다.
			} catch(InterruptedException ie) {
				System.out.println(tName + 
						" shutdownNow() 호출");
				return;
			}
		}
	}
}
