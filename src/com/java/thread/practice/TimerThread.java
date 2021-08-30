/**
 * 
 */
package com.java.thread.practice;

import java.time.LocalTime;

/**
 * @author lpf18
 *
 */
public class TimerThread extends Thread{
	
	@Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
