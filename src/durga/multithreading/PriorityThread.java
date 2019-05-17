package durga.multithreading;

class Priority extends Thread {
	// Run method is executed by the child thread
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class PriorityThread {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getPriority());
		Priority p1 = new Priority();
		p1.setPriority(10);
		p1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
