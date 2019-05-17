package durga.collection.map;
//underlying data structure is HashTable.useful for search operation.
//Insertion order is not preserved and it is based on Hashcode of keys
//Duplicates are not allowed but values are allowed
//Heterogeneous objects are allowed for both key and value
//null is allowed only once for key and for values any no of times.
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap m1=new LinkedHashMap();//insertion order preserved
		//HashMap m1=new HashMap();//Insertion order not preserved
		m1.put("Durga", 100);
		m1.put("Vishal", 200);
		m1.put("Vaishu", 300);
		m1.put("Jyoti", 400);
		m1.put("Amruta", 500);
		m1.put("Pradnya", 600);
		System.out.println(m1.put("Durga", 1000));
		System.out.println(m1);
		
		Set s=m1.keySet();
		System.out.println(m1);
		
		Collection c=m1.values();
		System.out.println(m1);
		
		Set s1=m1.entrySet();
		System.out.println(m1);
		
		Iterator i=s1.iterator();
		while(i.hasNext()) {
			Map.Entry m2=(Map.Entry)i.next();
			System.out.println(m2.getKey()+"  "+m2.getValue());
			if(m2.getKey().equals("Durga")) {
				m2.setValue(800000);
				
			}
		}
		System.out.println(m1);
		
		System.out.println(Collections.synchronizedMap(m1));
	}

}
