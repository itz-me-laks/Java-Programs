package java_practice_programs;
import java.util.*;
public class EnhancedForLoop {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] arr=new int[3][3];//row size is mandatory
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
			
		}
		for(int[] j:arr)
		{
			System.out.println(Arrays.toString(j));
		}

	}

}
