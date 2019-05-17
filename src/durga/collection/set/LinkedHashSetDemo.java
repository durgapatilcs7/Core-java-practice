package durga.collection.set;
//The difference in Hashset and LinkedHashset is Insertion order is preserved in Linked Hashset
//underlying data structure is Hashtable and linkedlist
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		hs.add("Durga");
		hs.add("Pooja");
		hs.add("Payal");
		hs.add("Radha");
		hs.add("Durga");
		System.out.println(hs.add("Durga"));
		hs.add(null);//null is possible only once
		System.out.println(hs);
		System.out.println(hs.size());
		//System.out.println(hs.toArray());
		hs.remove("Durga");
		hs.clear();
		System.out.println(hs.isEmpty());
	}

}
