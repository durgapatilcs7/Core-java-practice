package durga.multithreading;

class MyThread2 extends Thread{
	public void start() {
		super.start();
		System.out.println("start method");
	}
	public void run() {
		System.out.println("run method");
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread2 t =new MyThread2();
		t.start();
		System.out.println("main Thread");
		//t.start();if we try to reastart the same thread we will get -- 
		//Exception in thread "main" java.lang.IllegalThreadStateException
	}

}
