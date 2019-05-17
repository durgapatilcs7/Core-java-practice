package durga.UtilityClasses;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String[] args) {
		String[] s= {"A","B","Z","C"};
		List l=Arrays.asList(s);
		System.out.println(l);	
		s[0]="K";
		System.out.println(l);
		l.set(1, "L");
		System.out.println(l);
		for(String s1:s)
			System.out.println(s1);
		//l.add("M");//UnsupportedOperationException**we cant varies size of array using list object
		//l.remove(1);//UnsupportedOperationException
		//l.set(2, new Integer(10));//java.lang.ArrayStoreException
	}

}
