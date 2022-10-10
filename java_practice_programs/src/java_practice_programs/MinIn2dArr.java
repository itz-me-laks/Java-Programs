package java_practice_programs;

public class MinIn2dArr {

	public static void main(String[] args) {
		int[][] arr= {{29,3,6,890},{10,90,-1,980},{45,66,77,100},{887,999,1000,1}};
		min(arr);

	}
	static void min(int[][] arr)
	{
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
