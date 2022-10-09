package java_practice_programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	    System.out.println("Enter number : ");
	    int no=in.nextInt();
	    boolean ans=isPrime(no);
	    System.out.println(ans);

	}
	static boolean isPrime(int num)
	{
		if(num<=1)
		{
			System.out.println("neither prime nor composite");
		}
		int c=2;
		while(num>c*c)
		{
			if(num%c==0)
			{
				return false;
			}
			c=c+2;
		}
		return true;
		
	}

}
