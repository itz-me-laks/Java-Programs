package java_practice_programs;

import java.util.Scanner;

public class ThreeDigitArmstrong {
	public static void main(String[] args) 
	{
		for(int i=100;i<1000;i++)
		{
		isArmstrong(i);
		}
	}
   static void isArmstrong(int num)
   {
	   int ans=0;
	   int original=num;
	   while(num>0)
	   {
		   int rem=num%10;
		   ans=ans+rem*rem*rem;
		   num=num/10;   
	   }
	   if(original==ans)
	   {
		   System.out.println(ans);
	   }
   }
}
