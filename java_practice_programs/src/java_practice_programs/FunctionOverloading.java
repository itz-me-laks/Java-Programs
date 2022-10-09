           //same name but different parameter
package java_practice_programs;
import java.util.Arrays;
import java.util.Scanner;

public class FunctionOverloading {

	public static void main(String[] args) {
		
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num1 ");
        int n1=in.nextInt();
        System.out.println("Enter num2 ");
        int n2=in.nextInt();
        sum(n1,n2);
        sum(78,90,54);
        sum(34.5f,12.6f);
        demo(120,130,150,170);
        demo("mango","pineapple","grapes","orange","banana");
	}
	static void sum(int n1,int n2)
	{
		int sum=n1+n2;
		System.out.println("sum of two number is "+sum);
	}
	static void sum(int n1,int n2,int n3)
	{
		int sum=n1+n2+n3;
		System.out.println("sum of three number is "+sum);
	}
	static void sum(float n1,float n2)
	{
		float value=n1+n2;
		System.out.println("sum of two number is "+value);
	}
	static void demo(String...v)
	{
		System.out.println(Arrays.toString(v));
	}
    static void demo(int...v)
    {
    	System.out.println(Arrays.toString(v));
    }
}
