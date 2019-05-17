package durga.collection.List;
//ListIterator applicable only for List Objects
//Bidirectional Cursor***Read remove add update operation can perform
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Durga");
		linkedList.add("Payal");
		linkedList.add("Shubhangi");
		linkedList.add("Shobha");
		System.out.println(linkedList);
		
		ListIterator<String> listIterator=linkedList.listIterator();
		while(listIterator.hasNext()) {
			String string=listIterator.next();
			if(string.equals("Durga")) {
				listIterator.remove();
				System.out.println(linkedList);
			}else if(string.equals("Payal")) {
				listIterator.add("Vaishu");
				System.out.println(linkedList);
			}else if(string.equals("Shobha")) {
				listIterator.set("Deepak");
				System.out.println(linkedList);
			}
		}
		System.out.println(linkedList);
	}

}
