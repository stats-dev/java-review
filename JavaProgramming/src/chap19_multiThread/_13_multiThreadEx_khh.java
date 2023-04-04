package chap19_multiThread;

public class _13_multiThreadEx_khh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 0) {
//						System.out.print(i+",");
						System.out.println(i);

					}
				}
//				System.out.println();
				
			}
		}); 
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 1) {
//						System.out.print(i+",");
						System.out.println(i);
					}
				}
//				System.out.println();
				
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 2) {
//						System.out.print(i + ",");
						System.out.println(i);
					}
				}
//				System.out.println();
				
			}
		});
		
		thread1.start();
		
		// thread1 완료될때까지 대기
		try {
			thread1.join(); //try-catch 넣어줘라. join을 호출한 시점에서 동작한 친구가 일시 정지가 된다.
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		thread2.start();
		
		// thread2 완료될때까지 대기
		try {
			thread2.join(); //try-catch 넣어줘라. join을 호출한 시점에서 동작한 친구가 일시 정지가 된다.
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// 마지막은 그대로!
		thread3.start();
		
//		t1.start();
//		try {
//			t1.join();
//			//t1 스레드가 작업 종료하기 전까지 메인스레드가
//			//일시정지 상태여서 아래 코드는 실행되지 않음.
//			t2.start();
//			t2.join();
//			//t2 스레드 모두 끝날때까지 메인스레드 동작 안함.
//			//이게 끝나야 아래있는 t3가 잘 실행이 됩니다.
//			t3.start();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	}

}
