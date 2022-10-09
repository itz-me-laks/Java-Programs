package java_practice_programs;

import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		int[] arr= {12,34,56,78,90,54,32,100,24,56};
		//swap(arr,0,6);
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void reverse(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(end>start)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	static void swap(int[] arr,int n1,int n2)
	{
		int temp=arr[n1];
		arr[n1]=arr[n2];
		arr[n2]=temp;
	}

}
