package durga.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue(new MyComparator());	
	    q.offer("A");
	    q.offer("Z");
	    q.offer("B");
	    q.offer("L");
	    q.offer("J");
	   
	    System.out.println(q);
	}
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		String s1=ob1.toString();
		String s2=ob2.toString();
		return s2.compareTo(s1);
	}
	
}