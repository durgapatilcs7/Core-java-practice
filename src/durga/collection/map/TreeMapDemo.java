package durga.collection.map;

import java.util.TreeMap;

//Underlying data structure is red black tree 
//Insertion order not preserved is is based on some sorting order of keys
//duplicates keys not allowed but values are allowed
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> m=new TreeMap<>();
		m.put(101, "Durga");
		m.put(100, "Jyoti");
		m.put(102, "Amruta");
		m.put(104, "Priya");
		m.put(103, null);
		System.out.println(m);
		m.put(null, "gggg");//NullPointerException...Null keys not allowed
	}

}
