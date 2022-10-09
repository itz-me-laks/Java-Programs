package java_practice_programs;
import java.util.*;
public class ArrayListBasic2 {
	public static void main(String args[])
	{
        ArrayList<Integer> list=new ArrayList<>(3);
         Scanner in=new Scanner(System.in);
         for(int i=0;i<5;i++)
          {
	          list.add(in.nextInt());
          }
        for(int i=0;i<5;i++)
           {
	           System.out.println(list.get(i));
	    
            }
        
}
}