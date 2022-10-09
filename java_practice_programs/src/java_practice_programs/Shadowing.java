package java_practice_programs;

public class Shadowing {
   static int a=12;//Object Dependent Things only used in ODT(use static)
   // a value can access throughout the class
	public static void main(String[] args) {
		
		System.out.println(a);
		shadow();
		int a=13;
		System.out.println(a);
	}
	static void shadow()
	{
		System.out.println(a);
	}	

}
