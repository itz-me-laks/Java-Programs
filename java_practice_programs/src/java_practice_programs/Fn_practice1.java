package java_practice_programs;

public class Fn_practice1 {

	public static void main(String[] args) {
		String msg="love to think!";
		System.out.println(msg);

	}
	static String call(String getMsg)
	{
		getMsg="love to go movies";//it won't display bcoz the object is newly created
		return getMsg;//it is the last statement
	}

}
