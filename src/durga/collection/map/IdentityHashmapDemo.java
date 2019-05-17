package durga.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
	   IdentityHashMap m=new IdentityHashMap();
	   //HashMap m =new HashMap();
	   Integer i1=new Integer(101);
	   Integer i2=new Integer(101);
	   m.put(i1, "Durga");
	   m.put(i2, "Sweety");
	   System.out.println(m);
	}

}
