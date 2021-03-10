package dev.java.code.thread;

public class ThreadLockDemo {

	public static void main(String[] args) throws InterruptedException {

		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();

		Thread t1 = new Thread(new SyncThread(o1, o2), "t1");
		Thread t2 = new Thread(new SyncThread(o2, o3), "t2");
		Thread t3 = new Thread(new SyncThread(o3, o1), "t3");

		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
		t3.start();
	}

}

class SyncThread implements Runnable {

	private Object obj1;
	private Object obj2;

	public SyncThread(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();

		synchronized (obj1) {
			System.out.println(threadName + "accquired lock on " + obj1);
			work();
			synchronized (obj2) {
				System.out.println(threadName + "accquired lock on " + obj2);
				work();
			}
			System.out.println(threadName + "relesed lock on " + obj2);
		}

		System.out.println(threadName + "relesed lock on " + obj1);
		System.out.println(threadName + "finished execustion");
	}

	private void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}