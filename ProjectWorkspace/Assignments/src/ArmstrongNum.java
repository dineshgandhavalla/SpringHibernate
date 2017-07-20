import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		System.out.println("please enter a number you want to check");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(ANum(num))
		{
			System.out.println("Given number"+num+" is an Armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
		
	}
	public static boolean ANum(int num){
		int res=0, rem=0 , arm=num;
		while(num!=0)
		{
			rem = num%10;
			res = res+ (rem*rem*rem);
			num = num/10;
		}
		
		if(arm==res)
		{
			return true;
		}
		return false;
		
	}
}
