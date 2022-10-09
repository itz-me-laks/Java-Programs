package java_practice_programs;

public class ScopeOfVar {

	public static void main(String[] args) {
		int rank=2;
		/*
		1. Anything that can be initialize outside the block
		 but can't be re-initialize inside the block
		 it will used inside the block
		 
		 2.Anything that can be initialize inside the block 
		 that can be re-initialize outside the block
		 but that can't be used
		 
		 */
		{
			rank=1;
			//int rank=10; can't re-initialize 
			System.out.println("inside block value is "+rank);
			char grade='A';
		}
		//grade ='c'; can't modify without re-initialize
		char grade='o';
	     System.out.println("grade is "+grade);
		
		System.out.println("outside block value is "+rank);
	}

}
