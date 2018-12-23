package com.demo.java8.thread;

public class ThreadInterrupt {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10E6;i++) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("interrupted..");
						break;
					}
					System.out.println("Running: " + i);
				}
				
			}
		});
		
		t1.start();
		Thread.sleep(100);
		t1.interrupt();
		t1.join();
		
	}
}
