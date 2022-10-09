package java_practice_programs;
import java.util.*;
public class ArrayListBasics {
/* Arraylist is an java collection framework
	in array to print the values that use one of the method (Arrays.toString())
	here this method is working internally 
	no need to mention we can directly print
	*/
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(3);
		list.add(3);
		list.add(44);
		list.add(77);
		list.add(79);
		list.add(5);
		list.add(3);
		//modify particular element in the arraylist
		list.set(3, 500);
		//check if it is contain
		list.contains(3);
		list.remove(2);
System.out.println(list);
	}

}
