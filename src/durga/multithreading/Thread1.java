package durga.multithreading;

class MyThread extends Thread {
	// Run method is executed by the child thread
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Heloo");
		}
	}
}

public class Thread1 {
	// main thread is responsible to run execute main()
	public static void main(String[] args) {
		MyThread m1 = new MyThread();// main thread creates object of child thread
		m1.start();// starting a thread---main thread start child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Hiii");
		}
	}

}
