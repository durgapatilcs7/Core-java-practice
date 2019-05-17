package durga.UtilityClasses;

import java.util.Arrays;
import java.util.Comparator;

public class SortElementOfArray {

	public static void main(String[] args) {
		int[] a= {10,60,40,30,5,90,70};
		System.out.println("Primitive array before Sorting");
		for(int a1:a) {
			System.out.println(a1+" ");
		}
		Arrays.sort(a);
		System.out.println("Primitive array after Sorting");
	
		for(int a1:a) {
			System.out.println(a1+" ");
		}
		
		String[] s= {"A","H","B","Z","C","X"};
		System.out.println("Object array before Sorting");
		for(String s1:s) {
			System.out.println(s1+" ");
		}
		Arrays.sort(s);
		System.out.println("Object array after Sorting");
		for(String s1:s) {
			System.out.println(s1+" ");
		}
		Arrays.sort(s,new MyComparator3());
		System.out.println("Object array after Customized Sorting");
		for(String s1:s) {
			System.out.println(s1+" ");
		}
	}

}
class MyComparator3 implements Comparator<String>{

	@Override
	public int compare(String ob1, String ob2) {
		String s1=ob1.toString();
		String s2=ob2.toString();
		return s2.compareTo(s1);
	}
	
}
