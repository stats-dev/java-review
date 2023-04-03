package chap19_multiThread;

public class _04_joinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 6; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};
		//t1 실행 대기 상태로 변경
		t1.start();
		
		try {
			//메인 스레드를 일시 정지 상태로 변경 join만나서 메인을 기다리게 함.
			//t1의 run() 메소드가 종료될 때까지 대기
			//t1의 run() 메소드가 종료되면 메인 스레드가 실행 대기 상태로 변경
			t1.join(); //try-catch 넣어줘라. join을 호출한 시점에서 동작한 친구가 일시 정지가 된다.
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		//메인 스레드의 작업
		for(int i = 1; i <= 5; i++) {
			System.out.println("메인 스레드 실행");
			System.out.println(i);
		}

	}

}
