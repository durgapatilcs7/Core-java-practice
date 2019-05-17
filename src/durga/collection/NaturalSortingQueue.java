package durga.collection;

import java.util.PriorityQueue;

public class NaturalSortingQueue {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<>();
		    q.offer("A");
		    q.offer("Z");
		    q.offer("B");
		    q.offer("L");
		    q.offer("J");
		   
		    System.out.println(q);
		 System.out.println(q.peek());
		//System.out.println(q.element());
		System.out.println(q.poll());
		//System.out.println(q.remove());
		System.out.println(q);
	}
}
