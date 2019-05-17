package durga.collection.List;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator is a universal cursor.it can be use for any collection object
public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<=10;i++) {
		arrayList.add(i);
		}
		System.out.println(arrayList);
		
		Iterator<Integer> iterator =arrayList.iterator();
		while(iterator.hasNext()) {
			int i =iterator.next();
			if(i%2==0) 
				System.out.println(i);
			else
				iterator.remove();
		}
		System.out.println(arrayList);
	}

}
