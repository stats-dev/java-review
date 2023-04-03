package chap19_multiThread.clazz;

public class NonSyncThread1 extends Thread{
	private PrintNumWithoutSync pns;
	
	public void setPns(PrintNumWithoutSync pns) {
		this.pns = pns;
	}
	
	public PrintNumWithoutSync getPns() {
		return pns;
	}

	@Override
	public void run() {
		pns.printNum1();
	}
}
