package com.OopsDemo;
/*this is a demo for object initialization through parameterized constructor*/

class Student3{
	int rno;
	String name;
	Student3(int r,String n){
		rno=r;
		name=n;
	}
}

public class ObjectInitialization3 {

	public static void main(String[] args) {
		Student3 s3= new Student3(500, "dinesh");
		System.out.println("this is Object intialization through constructor");
		System.out.println("roll no :"+s3.rno);
		System.out.println("name:"+s3.name);

	}

}
