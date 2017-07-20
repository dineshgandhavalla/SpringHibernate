package com.OopsDemo;
/*This is a demo for method overloading same method name with different parameters*/
class Test{
	static int add(int a , int b){
		return a+b;
	}
	static int add(int a , int b , int c){
		c=a+b;
		return c;
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.add(12, 15));
		System.out.println(t.add(54, 42, 0));
		

	}

}
