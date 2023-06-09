package lambdas.ex;

public class Trabalho1 implements Runnable{

	@Override
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			System.out.println("tarefa #01");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}

	
	
}
