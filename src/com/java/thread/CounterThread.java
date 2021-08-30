package com.java.thread;

public class CounterThread extends Thread {

	// 对象锁和类锁有什么区别
	private String threadNameString;
	private Object shareDataObject;

	public CounterThread(String threadNameString, Object shareDataObject) {
		super(threadNameString);
		this.shareDataObject = shareDataObject;

	}

	@Override
	public void run() {
		// 任何；类里面都可以使用这个关键字
		/*
		 	通过synchronized关键字实现多线程的串行运行
		 */
		synchronized (shareDataObject) {
			for (int i = 0; i < 3; i++) {
				System.out.println(getName() + " : " + i);
			}

		}
	}

	/*
	 * 多个线程之间共享一个数据，定义一个任意类型的普通变量即可
	 */

	private static Object shareObject = new Object();

	public static void main(String[] args) {

		new CounterThread("线程1", shareObject).start();
		new CounterThread("线程2", shareObject).start();

	}

}
