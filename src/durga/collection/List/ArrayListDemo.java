package durga.collection.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {
		//duplicates are allowed and insertion order must be preserved,null possible,useful for retrival and search operation
		ArrayList<String> arrayList=new ArrayList<String>();
		String s="hi";
		arrayList.add("String");
		arrayList.add(s+s);
		arrayList.add(s);
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("null");
		arrayList.add("C");
		arrayList.add("C");
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
		
		arrayList.add(2,"M");
		arrayList.add("N");
		System.out.println(arrayList);
		
		arrayList.set(0, "S");
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.indexOf("C"));
		System.out.println(arrayList.lastIndexOf("C"));
		System.out.println(arrayList.contains("Z"));
		System.out.println(arrayList.size());
		
		System.out.println(arrayList instanceof Serializable);
		System.out.println(arrayList instanceof Cloneable);
		System.out.println(arrayList instanceof RandomAccess);
		
		List<String> l1= Collections.synchronizedList(arrayList);//by default arrayList is Non synchronized
		//By using Collections.synchronized(arrayList) we get synchronized version
		System.out.println(l1);
	}

}
