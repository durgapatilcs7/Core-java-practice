package durga.collection;

import java.util.LinkedList;

//data structure is doubly linked list,insertion order preserved,duplicates are allowed,null possible
//best choice for insertion and deletion
public class LinkedListDemo {

	public static void main(String[] args) {
	    LinkedList l=new LinkedList();
	    l.add("durga");
	    l.add(30);
	    l.add(null);
	    l.add("durga");
	    l.set(0, "Software");
	    l.add(1, "Jyoti");
	    System.out.println(l);
	    l.addFirst("Hiiii");
	    l.addLast("Hellooooo");
	    System.out.println(l);
	    l.removeLast();
	    l.removeFirst();
	    System.out.println(l);
	    System.out.println(l.getFirst());
	    
	    System.out.println(l.getLast());
		
	}

}
