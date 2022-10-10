package java_practice_programs;

public class FindCharInString {

	public static void main(String[] args) {
		String hobbies="Drawing";
		char target='h';
		System.out.println(search(hobbies,target));
		
	}
	static boolean search(String str,char target)
	{
		if(str.length()==0)
		{
			return false;
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==target)
			{
				return true;
			}
		}
		return false;
		
	}

}
