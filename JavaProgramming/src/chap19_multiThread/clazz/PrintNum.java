package chap19_multiThread.clazz;

public class PrintNum {
	static int flag = 0;
	
	public void printNum(int num) {
		//Thread t1, t2
		//t1은 1~num까지 출력
		//t2는 num~num * 2까지 출력
		//스레드 두개 모두 시작 대기 상태로 만든 후 t1먼저 등록
		//join()메소드를 이용해서 t2가 먼저 실행되도록
		Thread main = Thread.currentThread();
		System.out.println(main.getName());
		
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= num; i++) {
					if(flag > 0) {
						System.out.println(i);
					} else {
						Thread.yield();
						i--;
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = num; i <= num * 2; i++) {
					System.out.println(i);
				}
				flag = 1;
			}
		};
		
//		t1.start();
		t2.start();
		
		try {
//			t1.join();
//			System.out.println("메인스레드 일시 정지");
//			t2.join();
//			System.out.println("t1스레드 일시 정지");
			t2.join(); // 메인스레드가 일시정지
			t1.start(); // 위에서 메인스레드가 일시정지돼서 t2가 종료될 때까지는 실행되지 않음.
			//요러면 flag 없이도 잘 활용해볼 수 있음.
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
