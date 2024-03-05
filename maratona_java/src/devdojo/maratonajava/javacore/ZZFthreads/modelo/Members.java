package devdojo.maratonajava.javacore.ZZFthreads.modelo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {

	private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	private boolean open  = true;
	
	public boolean isOpen() {
		return open;
	}
	
	public int pendingEmails() {
		synchronized (emails) {
			return emails.size();
		}
	}
	
	public void addMemberEmail(String email) {
	
		synchronized (this.emails) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " adcionou email na lista");
			this.emails.add(email);
			this.emails.notifyAll();
		}
	}
	
	public String retriveEmail() throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+ " checking if there"
				+ " are emails");
		synchronized (emails) {
			while(this.emails.size() == 0) {
				if(!open ) break;
				System.out.println(Thread.currentThread().getName()+ " Não tme email"
				+ " disponível na lista, entrando em modo de espera");
				this.emails.wait();
			}
			return this.emails.poll();
		}
	}	
	
	public void close() {
		open = false;
		synchronized (emails) {
			System.out.println(Thread.currentThread().getName()+ " ");
		}
	}
	
	
}
