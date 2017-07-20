package patternprograms;

public class pattern3 {

	public static void main(String[] args){
		int i,j,k=1,p=5;
		for(i=0;i<4;i++)
		{
			for(j=0;j<k;j++)
			{
				System.out.print("x");
			}
			k=k+2;
			System.out.println();
		}
		
		for(i=4;i>0;i--)
		{
			for(j=p;j>0;j--)
			{
				System.out.print("x");
			}
			p=p-2;
		System.out.println();
		}
		
		
		
	
	}
	
}
