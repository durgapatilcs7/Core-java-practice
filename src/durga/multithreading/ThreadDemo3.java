package durga.multithreading;

public class ThreadDemo3 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());//return name of the thread
		
		Thread.currentThread().setName("Durga");//changes the name of thread
		System.out.println(Thread.currentThread().getName());

	}

}
