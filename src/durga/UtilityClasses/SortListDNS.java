package durga.UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;

public class SortListDNS {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("A");
		a.add("B");
		a.add("H");
		a.add("C");
		a.add("Z");
		a.add("M");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}
