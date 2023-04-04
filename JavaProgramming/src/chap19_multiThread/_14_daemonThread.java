package chap19_multiThread;

import chap19_multiThread.clazz.AutoSaveThread;

public class _14_daemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread ast = new AutoSaveThread();
		//AutoSaveThread 객체를 데몬 스레드로 설정
		ast.setDaemon(true); //이렇게 하면 데몬으로 만들어주게 된다.
		
		ast.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());			
		}
		
		
		System.out.println("메인 스레드 종료됨.");
		System.out.println("데몬 스레드인 AutoSaveThread도 자동으로 종료됨.");

	}

}
