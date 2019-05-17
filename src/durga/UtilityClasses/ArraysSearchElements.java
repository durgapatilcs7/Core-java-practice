package durga.UtilityClasses;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchElements {

	public static void main(String[] args) {
		int[] a= {10,60,40,30,5,90,70};
		Arrays.sort(a);
		for(int a1:a) {
			System.out.println(a1);
		}
		System.out.println(Arrays.binarySearch(a, 40));
		System.out.println(Arrays.binarySearch(a, 25));
		
		String[] s= {"A","H","B","Z","C","X"};
		Arrays.sort(s);
		for(String a1:s) {
			System.out.println(a1);
		}
		
		System.out.println(Arrays.binarySearch(s, "A"));
		System.out.println(Arrays.binarySearch(s, "D"));
		
		Arrays.sort(s,new MyComparator4());
		for(String a1:s) {
			System.out.println(a1);
		}
		System.out.println(Arrays.binarySearch(s, "A"));
		System.out.println(Arrays.binarySearch(s, "D"));
	}

}
class MyComparator4 implements Comparator<String>{

	@Override
	public int compare(String ob1, String ob2) {
		String s1=ob1.toString();
		String s2=ob2.toString();
		return s2.compareTo(s1);
	}
	
}
