package java_practice_programs;
import java.util.*;
public class Forloop1 {

	public static void main(String[] args) {
		int[] input_arr=new int[10];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<input_arr.length;i++)
		{
                input_arr[i]=in.nextInt();
		}
		for(int j:input_arr)
		{
			System.out.println(j);
		}

	}

}
