package com.java.thread.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorService {
	
}
class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
    	System.out.println("start task " + name);
    	try {
    		Thread.sleep(1000);
    	} catch (InterruptedException e) {
    	}
    	System.out.println("end task " + name);
    }  
}
