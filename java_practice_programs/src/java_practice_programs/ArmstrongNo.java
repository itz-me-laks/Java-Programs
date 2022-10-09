package java_practice_programs;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	    System.out.println("Enter an  number : ");
	    int no=in.nextInt();
	    isArmstrong(no);
	}
	static void isArmstrong(int num)
	{
		int original_val=num;
		int res=0;
		while(num>0)
		{
			int rem=num%10;
			res=res+rem*rem*rem;
			num=num/10;
		}
		if(original_val==res)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}
