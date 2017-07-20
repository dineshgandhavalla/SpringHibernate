
public class FibWith2Var {

	public static void main(String[] args) {
		long x=0,y=1;
		int i;
		System.out.println(x);
		
		for(i=2;i<=200;i++){
			y=x+y;
			x=y-x;
			
			System.out.println(y);
		}
		
	}

}
