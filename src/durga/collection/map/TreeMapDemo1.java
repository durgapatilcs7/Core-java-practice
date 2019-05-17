package durga.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap m=new TreeMap(new MyComparator());
		m.put("XXXX", 10);
		m.put("CCCC", 20);
		m.put("AAAA", 30);
		m.put("BBBB", 40);
		m.put("PPPP", null);
		System.out.println(m);
	
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		String s1=ob1.toString();
		String s2=(String)ob2;
		return s2.compareTo(s1);
	}
	
}