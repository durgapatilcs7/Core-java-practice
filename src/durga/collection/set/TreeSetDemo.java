package durga.collection.set;

import java.util.TreeSet;

//underlying data structure is balanced tree
//Heterogeneous objects are not allowed otherwise we will get ClassCastException
//All Objects inserted according to some sorting order
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Object> tr=new TreeSet<>();
		tr.add("Apple");
		tr.add("Mango");
		tr.add("Orange");
		tr.add("Banana");
		tr.add("Peech");
		//tr.add(1);
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr.comparator());//return null bcoz default natural sorting order is Ascending
		System.out.println(tr.headSet("Apple"));
		System.out.println(tr.subSet("Apple", "Orange"));
	}

}

	