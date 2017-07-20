package com.OopsDemo;

public class MultipleExceptionsInSingleCatch {

	public static void main(String[] args) {
		try{
			int a,b,c;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Exceptions have been handled");
		}
	}

}
