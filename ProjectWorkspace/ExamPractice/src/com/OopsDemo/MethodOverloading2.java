package com.OopsDemo;
class TestDemo{
	static int add(int a,int b){
		return a+b;
	}
	static double add(double a,double b){
		return a+b;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		TestDemo td = new TestDemo();
		System.out.println("method with return type int:"+td.add(45, 60));
		System.out.println("overloading method with different data type:"+td.add(78.5, 96.2));

	}

}
