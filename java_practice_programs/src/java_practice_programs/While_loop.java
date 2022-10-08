package java_practice_programs;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number that you want for creating tables..");
		int no=in.nextInt();
		//printing 5 table using for loop
		//int no=5;
		for(int i=1;i<=20;i++)
		{
			System.out.println(i +"*"+  no +"="+i*no);
		}
//		int num=100;
//		while(num<=1000)
//		{
//			System.out.println(num);
//			num=num+100;
//		}
		int salary=100000;
		while(salary<=500000)
		{
			System.out.println("My salary after incremented by one month "+salary);
			salary=salary+25000;
		}
System.out.println("this is not end ..!");
	}

}
