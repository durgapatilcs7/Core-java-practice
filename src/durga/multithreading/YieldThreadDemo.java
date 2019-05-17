package durga.multithreading;
//To prevent thread execution use yield()

class MyYield extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();//here main thread will get chance to execute more no of times
		}
	}
}

public class YieldThreadDemo {

	public static void main(String[] args) {
		MyYield y1 = new MyYield();
		y1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
