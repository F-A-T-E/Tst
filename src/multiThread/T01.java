package multiThread;

import org.openjdk.jol.info.ClassLayout;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class T01 {
	/*
	 * CAS
	 * 
	 */
	
	public static void main(String[] args) {
		Object o = new Object();
		
		System.out.println(ClassLayout.parseInstance(o).toPrintable());
		
		
		synchronized (o) {
			System.out.println(ClassLayout.parseInstance(o).toPrintable());
			
			
			/*
			 * synchronized (lock) {
			 * System.out.println(ClassLayout.parseInstance(o).toPrintable()); }
			 */
			
		}
	}

}
