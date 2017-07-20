package practiceTasks;

import java.util.Scanner;

public class DuplicatesInArray 
{
	public static void main(String[] args) 
	    {
		// int arr[] ={3,60,35,3,45,35,5};
			System.out.println("please enter the size of the array");
			
			Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int arr[] = new int[size];
			
			System.out.println("please enter the elements");
			Scanner n = new Scanner(System.in);
			
			for(int i=0;i<size;i++)
			{
				arr[i]=n.nextInt();
				System.out.println("element @ "+i+" in array:"+ arr[i]);
			}
	        for (int j = 0; j < size-1; j++)
	        {
	            for (int k = j+1; k <size; k++)
	            {
	                if( (arr[j]==arr[k]) && (j != k) )
	                {
	                    System.out.println("Duplicate Element is : "+arr[k]);
	                }
	            }
	        }
	    }    
	
	    }

