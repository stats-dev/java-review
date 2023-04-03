package chap19_multiThread.clazz;

public class SyncThreadWaitNotify2 extends Thread{
	private PrintNumWithWaitNotify_khh pns;

	public void setPns(PrintNumWithWaitNotify_khh pns) {
		this.pns = pns;
	}
	
	public PrintNumWithWaitNotify_khh getPns() {
		return pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(20);
	}
}
