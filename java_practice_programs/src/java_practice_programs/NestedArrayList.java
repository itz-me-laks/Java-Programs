package java_practice_programs;
import java.util.*;
public class NestedArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new  ArrayList<>();
		Scanner in=new Scanner(System.in);
		//we have to initialize the arraylist
		for(int i=0;i<5;i++)
		{
			list.add(new ArrayList<>());
		}
		//adding element
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				list.get(i).add(in.nextInt());
			}
		}
		
		System.out.println(list); 

	}

}
