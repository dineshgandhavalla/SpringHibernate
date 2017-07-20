import java.util.*;
class PalindromeDemo
{
	public static void main(String args[])
	{ 
		String word = null;
		
		System.out.println("please enter the string you want to check ...");

		Scanner s = new Scanner(System.in);
		word = s.nextLine();

		
		System.out.println("the string is :"+word.hashCode());


		if(word!=null)
		{
			//String rev = null;
			String rev = new StringBuffer(word).reverse().toString(); 
			System.out.println("the reverse of string is :" +rev);
			System.out.println(word.equals(rev));

		}
		else
		{
			System.out.println("Invalid input");
		}

	}
		//System.out.println("please enter the string you want to check ...");
	
	/*if(word!=null)
	{
		String reverse = null;
		String reverse = new StringBuffer(word).reverse().toString(); 
		System.out.println("the reverse of string is :" +reverse);
		System.out.println(word.equals(reverse));

	}
	else
	{
		System.out.println("Invalid input");
	}*/
}