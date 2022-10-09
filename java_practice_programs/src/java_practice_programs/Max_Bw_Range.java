package java_practice_programs;

public class Max_Bw_Range {

	public static void main(String[] args) {
		int[] arr= {12,19,65,90,34,56,89,70,34,200};
		max_range(arr,6,8);

	}
	static void max_range(int[] arr1,int start,int end)
	{
		int max=arr1[1];
		for(int i= start;i<=end;i++)
		{
			if(arr1[i]>max)
			{
				max=arr1[i];
			}
		}
		System.out.println(max);
	}
}

