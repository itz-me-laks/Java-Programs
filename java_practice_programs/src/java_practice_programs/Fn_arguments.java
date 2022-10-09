package java_practice_programs;

import java.util.Scanner;

public class Fn_arguments {

	public static void main(String[] args) {
		String ans=callme();//without argument
		System.out.println("I'm new here call me  "+ans);
        calc(600,300);
	}
	static String callme()
	{
	    Scanner in =new Scanner(System.in);
	    System.out.println("Enter you name : ");
	    String name=in.next();
	    return name;
	}
	static int calc(int n1,int n2)//with argument
	{
		int sum=n1+n2;
		System.out.println("sum of 2 no "+sum);
		int sub=n1-n2;
		System.out.println("subtraction of 2 no "+sub);
		int mul=n1*n2;
		System.out.println("multipication of 2 no "+mul);
		int div=n1-n2;
		System.out.println("division of 2 no "+div);
		return 1;		
	}

}
