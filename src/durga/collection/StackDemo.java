package durga.collection;
//child class of vector and use LIFO order
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.add("Durga");
		stack.push("Vaishu");//insert object into stack
		stack.addElement("Manisha");
		stack.push("Payal");
		stack.push("Swapna");
		stack.push("Vaishu");
		stack.push(null);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());//remove last added element and returns
		System.out.println(stack);
		
		System.out.println(stack.peek());//return top of the stack without removal
		
		System.out.println(stack.search("Durga"));
		
	}

}
