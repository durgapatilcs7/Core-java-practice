package durga.multithreading;

class JoinThread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				
			}
		}
	}
}

public class JoinThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		JoinThread t= new JoinThread();
		t.start();
		t.join();//main thread waits until completing execution of the child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
