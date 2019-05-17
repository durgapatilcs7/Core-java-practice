package durga.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		
		List<Integer> integers=Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
		
		/**
		 * Imperative
		 */
		List<Integer> uniqueList=new ArrayList<Integer>();
		
		for(Integer integer:integers) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		
		System.out.println("UniqueList :" +uniqueList);
		
		/**
		 * Declarative
		 */
		
		List<Integer> uniqueList1 = integers.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("UniqueList1 :" +uniqueList1);
	}

}
