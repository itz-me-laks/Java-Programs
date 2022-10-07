package java_practice_programs;

import java.util.Scanner;

public class SumOfTwoNum
{

	public static void main(String[] args) 
	{
		
	    int ans=sum_of_two_no();
	    System.out.println("Sum of two number is "+ans);
	}
	
	   static int sum_of_two_no() //return_type name
	{
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter a number1 : ");
	   int n1=in.nextInt();
	   System.out.println("Enter a number2 : ");
	   int n2=in.nextInt();
	   int sum=n1+n2;
	   return sum;
	   
	}
}


