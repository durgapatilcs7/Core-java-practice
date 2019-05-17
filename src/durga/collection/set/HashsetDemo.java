package durga.collection.set;
//Duplicates are not allowed and insertion order not preserved
//underlying data structure is HashTable
import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
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
