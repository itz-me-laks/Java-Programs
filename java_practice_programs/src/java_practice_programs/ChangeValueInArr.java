package java_practice_programs;

import java.util.Arrays;

public class ChangeValueInArr {
	public static void main(String[] args) 
	{
		//swapping using array
		int[] arrays= {12,13,14,15,16};
		swap(arrays);
		System.out.println(Arrays.toString(arrays));

	}
	static void swap(int[] changeValue)
	{
		changeValue[3]=25;
		
	}

}
