package devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExample2 extends Thread {
    private  char b = 0;
    
    public ThreadExample2(char b) {
	this.b = b;
    }
    
    @Override
    public void run(){
	System.out.println(Thread.currentThread().getName());
	
	for (int i = 0; i < 500; i++) {
	    System.out.println(b);
	    if(i % 100 == 0) {
		System.out.println();
	    }
	}
    }    
}

class ThreadExempleRunnable implements Runnable {

    private char c;
    
    public  ThreadExempleRunnable(char c) {
	this.c = c;
    }
    
    @Override
    public void run() {
	System.out.println(Thread.currentThread().getName());
	
	for (int i = 0; i < 500; i++) {
	    System.out.println(c);
	    if(i % 100 == 0) {
		System.out.println();
	    }
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
	
    }
    
}





public class ThreadTest01 {

    public static void main(String[] args) {
	
	/*
	 * ThreadExample t1 = new ThreadExample('A'); ThreadExample t2 = new
	 * ThreadExample('B'); ThreadExample t3 = new ThreadExample('C'); ThreadExample
	 * t4 = new ThreadExample('D'); t1.start(); t2.start(); t3.start(); t4.start();
	 */
	
	
	Thread t1 = new Thread(new  ThreadExempleRunnable('A'));
	Thread t2 = new Thread(new  ThreadExempleRunnable('B'));
	Thread t3 = new Thread(new  ThreadExempleRunnable('C'));
	Thread t4 = new Thread(new  ThreadExempleRunnable('D'));
	t1.start();
	t2.start();
	t3.start();
	t4.setPriority(Thread.MAX_PRIORITY);
	
	
	
	
	
	
	
	
    }

}
