//Program by implementing Runnable interface
package durga.multithreading;

class RunnableInterface implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Helloo");
			}
	}
}
class MyRunnable{

	public static void main(String[] args) {
		RunnableInterface r1 = new RunnableInterface();
		Thread t = new Thread(r1);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("hiiii");
			}
	}

}
//we can't get exact output,we will get mixed output