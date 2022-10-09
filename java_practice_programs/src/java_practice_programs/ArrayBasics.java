/* 
  size is mandatory
 
  int[] arr3=new int[5];//valid
 
  int arr3[]=new int[5]//not valid
  
 */
package java_practice_programs;

import java.util.Arrays;

public class ArrayBasics {
	public static void main(String[] args)
	{
		int[] arr;//declaring array
		arr=new int[3]; //creating object in the heap memory
		//new keyword is used to create an object in the heap memory
		arr[0]=12;
		arr[1]=34;
		arr[2]=24;
		System.out.println("using for loop to display values");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
		int[] arr1={1,2,3,9,4,5};
		System.out.println("using for each loop to display values");
        for(int j:arr1)
        {
        
        	System.out.println(j);
        }
	}

}
