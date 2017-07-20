package com.OopsDemo;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try{
			
		int a, b, c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;
		System.out.println("output:"+c);
		}
		catch(ArithmeticException e){
			System.out.println("number can't be divided by zero");
			e.printStackTrace();
		}
		catch(NumberFormatException e){
			System.out.println("given input is not a number");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("illegal no of arguments");
			e.printStackTrace();
		}
	}

}
