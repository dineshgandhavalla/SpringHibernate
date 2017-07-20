import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		int i,fact=1;
		System.out.println("please the a number to find factorial of that number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("The Factorial of "+num+"!"+" is :"+fact );
	}

}
