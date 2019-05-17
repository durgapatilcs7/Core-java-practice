package durga.collection.map;
//Insertion order not preserved.
//null is not allowed for both key and value.
//Heterogeneous objects are allowed for both keys and value.
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable hashtable=new Hashtable(25);
		hashtable.put(new Temp1(5), "A");
		hashtable.put(new Temp1(2), "B");
		hashtable.put(new Temp1(6), "C");
		hashtable.put(new Temp1(12), "D");
		hashtable.put(new Temp1(23), "E");
		hashtable.put(new Temp1(24), "E");
		System.out.println(hashtable);

	}

}
class Temp1{
	int i;
	Temp1(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
		}
	public String toString() {
		return i+"";
	}
}
