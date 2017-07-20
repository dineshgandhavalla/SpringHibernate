package com.OopsDemo;
/*this is a demo for ObjectInitialization through method*/

class Student2{
	int rno;
	String name;
	void getData(int r ,String n){
		rno=r;
		name=n;
	}
	void printData(){
		System.out.println("roll no  :"+rno);
		System.out.println("name :"+name);
	}
}
public class ObjectInitialization2 {

	public static void main(String[] args) {
		
		Student2 s2 = new Student2();
		s2.getData(101, "dinesh");
		System.out.println("this is object initialization through method");
		s2.printData();

	}

}
