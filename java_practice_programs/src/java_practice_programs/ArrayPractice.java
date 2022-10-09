package java_practice_programs;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		int[][] arr= {{2,3,4},{4,8},{9,4,3,7}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/* Easiest way to print 2dimensional array
		for(int[] j:arr)
		{
			System.out.println(Arrays.toString(j));
		}
		*/

	}

}
