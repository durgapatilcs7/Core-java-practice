package durga.collection.List;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		for(int i=1;i<=10;i++) {
			vector.add(i);	
		}
		System.out.println(vector);
		
		Enumeration<Integer> e = vector.elements();
		while(e.hasMoreElements()) {
			int i = (int) e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println(vector);

	}

}
