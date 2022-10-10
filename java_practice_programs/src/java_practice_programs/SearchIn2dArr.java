package java_practice_programs;

import java.util.Arrays;

public class SearchIn2dArr {

	public static void main(String[] args) {
		int[][] arr= {{2,3,6},{10,90},{45,66,77}};
		int target=90;
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
		
	}
	static int[]  search(int[][] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
				{
					return new int[] {i,j};
				}
				
			}
		}
		return new int[] {-1,-1};
	}

}
