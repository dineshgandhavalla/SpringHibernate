package practiceTasks;

import java.util.Scanner;

public class ArraySum {
	public static void main(String []args)
	{
		int sum=0;
		System.out.println("please enter the size of the array");
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		
		System.out.println("please enter the elements");
		Scanner n = new Scanner(System.in);
		
		for(int i=0;i<size;i++)
		{
			a[i]=n.nextInt();
			System.out.println("element @ "+i+" in array:"+ a[i]);
			sum = sum+a[i];
			
		}
		
		System.out.println("sum of the elements in array are:"+sum);
	}
}
