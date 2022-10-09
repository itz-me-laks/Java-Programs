package java_practice_programs;

public class MaxArr {

	public static void main(String[] args)
	{
		int[] arr= {100,55,89,70000,879,11111,77,999,1000};
		max(arr);
	}
	static void max(int[] arr1)
	{
		int max_no=arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max_no)
			{
				max_no=arr1[i];
			}
		}
		System.out.println(max_no);
	}

}
