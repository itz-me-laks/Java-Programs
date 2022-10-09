package java_practice_programs;

import java.util.Scanner;

public class Fn_practice {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	    System.out.println("Enter your nick name : ");
	    String nickName=in.next();
	    String ans=call(nickName); 
	    System.out.println(ans);

	}
	static String call(String getName)
	{
		return " hello "+getName;
	}

}
