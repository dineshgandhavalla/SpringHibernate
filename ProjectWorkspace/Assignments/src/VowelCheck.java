import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		
		System.out.println("Please Enter a Character ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println("Given Char "+"'"+ch+"'"+"is a Vowel");
		}
		else if((ch>'a'&&ch<'z')||(ch>'A'&&ch<'Z'))
		{
			System.out.println("Given Char is not a Vowel,It's a Consonant" );
		}
		else
		{
			System.out.println("please enter an Alphabet");
		}
	}

}
