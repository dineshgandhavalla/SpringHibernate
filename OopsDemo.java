class Bikes
{
	//int num;
	public void  engine(int num)
	{
		if (num>500)
		{
			System.out.println("Woah!It's a Superbike");
		}
		else
		{
		System.out.println("It's a Commuter bike");
		}

	}

}
class SuperBikes extends Bikes
{
	//int price;
	public int cost(int price)
	{
		
		if (price>=300000)
		{
			System.out.println("Yo, It's a costly bike " +""+price);
		}
		return price;

	}
}

public class OopsDemo
{
	public static void main(String args[])
	{
		SuperBikes s = new SuperBikes();
		s.engine(350);
		int v =s.cost(300000);
		System.out.println(v);
	}
}