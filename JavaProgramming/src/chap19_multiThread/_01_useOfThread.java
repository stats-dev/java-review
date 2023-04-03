package chap19_multiThread;

public class _01_useOfThread {

	public static void main(String[] args) { //메인스레드, 메인함수 자체가 스레드 설정 없이 메인스레드가 된다.
		// TODO Auto-generated method stub
		//1. 스레드의 정의
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println("서브 스레드1 실행 중 : " + i);
					
//					Thread.sleep(i); // 에러가 남. try catch 사용.
					//현재 실행되는 스레드 중지 0.5초동안
					//멈추면 다음 스레드 동작함.
					//대기중인 메인스레드로 돌아간다.
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});

//		Thread t1 = new Thread();
		//실행이 아니라 실행 대기 큐에 넣어주는 것임.
		thread.start();
		
		
		for(int i = 6; i <= 10; i++) {
			System.out.println("메인" + i);
			
			try {
				//현재 실행되는 스레드 중지 0.5초동안
				//멈추면 다음 스레드 동작함. (이렇게 반복해서 스레드가 실행되는 것으로 보인다.)
				//대기 중인 서브 스레드로 돌ㅇ간다.
				Thread.sleep(500);//0.5초 sleep에서 정지됨.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
		
		
		
	}

}
