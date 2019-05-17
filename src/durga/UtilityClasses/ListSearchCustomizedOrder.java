package durga.UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSearchCustomizedOrder {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("A");
		a.add("B");
		a.add("H");
		a.add("C");
		a.add("Z");
		a.add("M");
		System.out.println(a);
		Collections.sort(a,new MyComparator2());
		System.out.println(a);
		System.out.println(Collections.binarySearch(a, "B",new MyComparator2()));
		System.out.println(Collections.binarySearch(a, "X",new MyComparator2()));
	}

}
class MyComparator2 implements Comparator<String>{

	@Override
	public int compare(String ob1, String ob2) {
		String s1=ob1.toString();
		String s2=ob2.toString();
		return s2.compareTo(s1);
	}
	
}