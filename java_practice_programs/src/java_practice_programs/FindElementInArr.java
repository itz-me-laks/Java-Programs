package java_practice_programs;

public class FindElementInArr {

	public static void main(String[] args) 
	{
		int[] arr= {23,56,78,90,22,45,66,92};
		int target=92;
		findElement(arr,target);

	}
	static void findElement(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("target is found "+target);
			}
			
		}
	
	}

}
