package chap98_homework_nc230404.threads;

public class NumberPrinter {
	
	private int num;

	
	public void setNum(int num) {
		this.num = num;
	}

	public void numPrint1(int num) {
		
		this.num = num;
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = num; i<=50; i++) {
					if(i % 3 == 0) {
						System.out.println(num + "부터 50까지 3의 배수: " + i);
						}
//					} else {
//						Thread.yield();
//						i--;
//					}
				}
			}
			
		};
		
		t1.start();
		
	
	}
	
	public void numPrint2(int num) {
		this.num = num;
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = num; i <= 100; i++) {
					if(i % 5 == 0 && i % 7 == 0) {
						System.out.println(num + "부터 100까지 중 5와 7의 공배수: " + i);
					}
				}
			}
		};
		
		t2.start();
		
		
		
	}
	
		
	


}
