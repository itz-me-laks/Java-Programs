//in java everything is inside the class
//by convention class name starts with caps
package java_practice_programs;
public class Basics_in_java 
{
	public static void main(String[] args)
	{
		int num=97905590;
		long num1=num;//implicit type conversion or automatic type conversion
		System.out.println(num1);
		//int num=num1;
		/* type conversions in long data type to small data type
		   leads to data leakage
		   small data type to long data type leads to implicit conversion
		   here no data leakage
		 */
		long value=123456789l;
		int value1=(int)(value);//Explicit type conversion
		System.out.println(value1);
		//boolean 
		if(true)
		{
			System.out.println("love code");
		}
		
//		if(false)
//		{
//			System.out.println("love code");
//		}
		
		

	}

}
