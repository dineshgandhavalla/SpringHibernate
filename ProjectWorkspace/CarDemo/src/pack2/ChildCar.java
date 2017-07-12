package pack2;

import java.util.Scanner;

import pack1.Car;

public class ChildCar extends Car {

	

	@Override
	public void baseCar() {
		System.out.println("enter the engine_cc value");
		Scanner sc=new Scanner(System.in);
		int engine_cc = sc.nextInt();
		
		if(engine_cc==900)
		{
			System.out.println("This is a HatchBack class with 900cc");
		}
		else if(engine_cc==1000)
		{	
		System.out.println("This is a Sedan class with 1000cc");
		}
		else if(engine_cc==1200)
		{
		System.out.println("This is a SUV class with 1200cc");
		}

	}
}