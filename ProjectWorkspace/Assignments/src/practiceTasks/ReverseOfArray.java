package practiceTasks;

import java.util.Scanner;

public class ReverseOfArray
{
	public static void main(String []args)
	{
		
	System.out.println("please enter the size of the array");
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int a[] = new int[size];
	int b[] = new int[size];
	
	System.out.println("please enter the elements ");
	Scanner n = new Scanner(System.in);
	
	
	for(int i=0;i<size;i++)
	{
		a[i]=n.nextInt();	
		System.out.println("element @ "+i+" in array:"+ a[i]);

	}
		System.out.println();
		System.out.println("Array after reversing :");
		
		
		int i=(size-1);
		for(int j=0;j<size;j++)
		{
		b[j]=a[i];
		i--;
		System.out.println("element @ "+j+" in array:"+ b[j]);
	
		}
	}
}
