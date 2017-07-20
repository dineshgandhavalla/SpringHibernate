package practiceTasks;

import java.util.Scanner;

public class RemoveElement {
	
	public static void main(String []args){
		
		System.out.println("please enter the size of the array");
		Scanner s = new Scanner(System.in);
		int i;
		int size = s.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		System.out.println("please enter the elements ");
		Scanner n = new Scanner(System.in);
		
		for( i=0;i<size;i++)
		{
			a[i]=n.nextInt();
			System.out.println("element @ "+i+" in array:"+ a[i]);

		}
		i=0;
		for(int j=0;j<size;j++)
		{
			b[j]=a[i];
			i++;
			
		}
		
		int del;
		Scanner d =new Scanner(System.in);
		System.out.println("enter the element you want to delete");
		del = d.nextInt();
		int j=(del+1);
		
		for(i=del;i<(size-1);i++)
		{
			b[i]=a[j];
			j++;
		}
		
		System.out.println("Array after removing element");
		for( i=0;i<size-1;i++)
		{
		
		System.out.println("element @ "+i+" in array:"+ b[i]);

		}

	}
}