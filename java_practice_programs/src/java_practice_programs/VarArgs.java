package java_practice_programs;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		varArgs(3,4,5,6,7,8,9);
		names("hema","dhanu","mani","karthika","akshe");
		//multipledatatypes(100,200,"roshini","hasini");
	}
	static int varArgs(int...v)
	{
		System.out.println(Arrays.toString(v));
		return 0;
	}
	static void names(String...v)
	{
		System.out.println(Arrays.toString(v));
	}
//	static void multipledatatypes(int a,int b,String...v)
//	{
//		System.out.println(Arrays.toString(v));
//	}
	
}
