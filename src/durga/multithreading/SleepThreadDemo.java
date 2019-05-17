package durga.multithreading;

//if thread dont want to perform any operation for a particular amount of time then use sleep()
class MySleepDemo extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("i am lazy Thread");
				Thread.sleep(5000);// here main thread will get chance to execute more no of times
			}
		} catch (InterruptedException ex) {
			System.out.println("I got interrupted");
		}
	}
}

public class SleepThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MySleepDemo t1= new MySleepDemo();
		t1.start();
		t1.interrupt();
		System.out.println("End of MAin");
	}

}
