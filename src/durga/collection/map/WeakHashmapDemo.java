package durga.collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashmapDemo {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap m=new WeakHashMap();
		//HashMap m = new HashMap();
		Temp temp=new Temp();
		m.put(temp, "Durga");
		System.out.println(m);
		temp=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}

}

class Temp{
	public String toString() {
		return "temp";
	}
	public void finlize() {
		System.out.println("Finilize Method called");
	}
}