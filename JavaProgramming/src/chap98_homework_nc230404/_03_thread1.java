package chap98_homework_nc230404;

public class _03_thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------스레드--------------------
//		1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다.
//		    각각의 스레드를 실행하십시오.
		
		Thread t1 = new Thread() {
			
			public void run() {
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0) {
						System.out.println("30의 약수: " + i);						
					}
					
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
				
			}
			
		};
		
		
		
		for(int i =1; i<=20;i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println("3과 4의 공배수 : " + i);
			}
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
		
		//2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.
		
		try {
			t1.join();
			t1.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
