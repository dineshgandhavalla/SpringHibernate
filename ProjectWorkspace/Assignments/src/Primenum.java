import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		int i,count=0;
		System.out.println("please enter number greater than 3");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
	
		for(i=2;i<=num/2;i++)
		{
			if(num%i!=0)
			{
				count++;
				break;
			}
			
		}
		
		if(count!=0)
		{
			System.out.println("Given num is a prime number"+num);
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
		
		
	}
}
