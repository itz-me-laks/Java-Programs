package java_practice_programs;
import java.util.*;
public class Greetings
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Greeting();

	}
	static void Greeting()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your good name here ! ");
		String name=in.next();
		System.out.println("hello... "+name+" !");
	}

}
