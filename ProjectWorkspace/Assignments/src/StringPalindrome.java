import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="";
		System.out.println("please enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		for(int i=len-1;i>0;i--)
		{
			str=str+s.charAt(i);
		}
		if(str.equals(s))
		{
			System.out.println("entered string is a plaindrome :"+s);
		}
		else
		{
			System.out.println("entered string is not a palindrome :"+s);
		}
	}

}
