package practiceTasks;

import java.util.Arrays;

public class ArraySorting 
{
	public static void main(String []args)
	{
		int[]  array1={ 45,1,31,54,12,90,5   };
	
	
	  String[] array2={"dinesh","ravi","vikranth","sreedhar"};
		
	System.out.println("numeric array: " +Arrays.toString(array1));
	
	Arrays.sort(array1);
	
	System.out.println("the sorted numeric array is:"+Arrays.toString(array1));

	System.out.println("string array: "+Arrays.toString(array2));
	
	Arrays.sort(array2);
	
	System.out.println("the sorted String array is: "+Arrays.toString(array2));

	}
}
