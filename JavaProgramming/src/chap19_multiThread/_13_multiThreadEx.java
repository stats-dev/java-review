package chap19_multiThread;

public class _13_multiThreadEx {

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
		
		
	}

}
