package chap19_multiThread;

public class _13_multiThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 0) {
						System.out.println(i);
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 1) {
						System.out.println(i);
					}
				}
			}
		};
		
		Thread t3 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 2) {
						System.out.println(i);
					}
				}
			}
		};
		
		t1.start();
		try {
			t1.join();
			//t1 스레드가 작업 종료하기 전까지 메인스레드가
			//일시정지 상태여서 아래 코드는 실행되지 않음.
			t2.start();
			t2.join();
			//t2 스레드 모두 끝날때까지 메인스레드 동작 안함.
			//이게 끝나야 아래있는 t3가 잘 실행이 됩니다.
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
