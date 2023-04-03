package chap19_multiThread.clazz;

public class SyncThread1 extends Thread{
	//private PrintNumWithSync pns;
	private PrintNumWithWaitNotify pns;
	
	public void setPns(PrintNumWithWaitNotify pns) {
		this.pns = pns;
	}
	
	public PrintNumWithWaitNotify getPns() {
		return pns;
	}

	@Override
	public void run() {
		pns.printNum1(10);
	}
}
