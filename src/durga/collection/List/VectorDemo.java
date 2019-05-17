package durga.collection.List;

import java.util.Vector;

//similar to ArrayList except vectors methods are synchronizes for thread safety
public class VectorDemo {

	
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		System.out.println(v.capacity());
		v.add("Durga");
		v.addElement("Jyoti");
		v.addElement("Pradnya");
		v.addElement("Vaishu");
		v.addElement("Vaishu");
		System.out.println(v);
		System.out.println(v.capacity());
		v.removeElementAt(0);
		//v.clear();
		//v.removeAllElements();
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.size());
	}

}
