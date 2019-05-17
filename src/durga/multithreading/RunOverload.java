package durga.multithreading;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("no arg run");
	}
	public void run(int i) {
		System.out.println("int arg run");
	}
}

public class RunOverload {

	public static void main(String[] args) {
	
		MyThread1 t =new MyThread1();
		t.start();//start() call only no arg constructor
	}

}
