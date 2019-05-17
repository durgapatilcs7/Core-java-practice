package durga.multithreading;

class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning");
		}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex) {
			
		}
		System.out.println(name);
	}
}
class MyThread4 extends Thread{
	Display d;
	String name;
	MyThread4(Display d,String name){
		this.d =d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread4 t1= new MyThread4(d,"Durga");
		t1.start();
		MyThread4 t2= new MyThread4(d,"Jyoti");
		t2.start();
		
	}

}
