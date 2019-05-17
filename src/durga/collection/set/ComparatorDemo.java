package durga.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet tr=new TreeSet(new MyComparator());
		tr.add("AAAA");
		tr.add(new StringBuffer("A"));
		tr.add(new StringBuffer("B"));
		tr.add(new StringBuffer("C"));
		tr.add("XAS");
		tr.add("ASD");
		tr.add(new StringBuffer("D"));
		tr.add(new StringBuffer("E"));
		System.out.println(tr);

	}

}
class MyComparator implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return +1;
		else 
		return s1.compareTo(s2);
	}
}
