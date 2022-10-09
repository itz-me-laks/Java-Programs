package java_practice_programs;

import java.util.Arrays;

public class SwapInArr {

	public static void main(String[] args) {
		int[] arr= {1000,900,800,700,600,500};
	  swap(arr,0,2);//passing index over here
       System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr1,int num1,int num2)
	{
		int temp=arr1[num1];
		arr1[num1]=arr1[num2];
		arr1[num2]=temp;
		
	}

}
