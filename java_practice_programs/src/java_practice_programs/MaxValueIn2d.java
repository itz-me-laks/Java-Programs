package java_practice_programs;

public class MaxValueIn2d {

	public static void main(String[] args) {
		int[][] arr= {{2,3,6,890},{10,90,980},{45,66,77,100},{887,999,1000}};
		max(arr);

	}
	static void max(int[][] arr)
	{
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
		       if(arr[i][j]>max)
		       {
			      max=arr[i][j];
			      
		       }
		}
	}
		System.out.println(max);
	}
}


