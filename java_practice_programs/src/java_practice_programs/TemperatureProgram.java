package java_practice_programs;
import java.util.Scanner;
public class TemperatureProgram
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter temperature in celcius");
		float temp_celcius=in.nextFloat();
		double temp_fahren=temp_celcius*1.8+32;
		System.out.println(" temperature in celcius to fahrenheit "+temp_fahren);

	}
}
