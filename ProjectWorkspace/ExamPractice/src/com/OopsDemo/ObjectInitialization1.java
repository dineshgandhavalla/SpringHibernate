package com.OopsDemo;
/*this is a demo for object initialization through reference variable*/

class Student1{
	int rno;
	String sname;
}

public class ObjectInitialization1 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.rno=101;
		s1.sname="dinesh";
		System.out.println("Student details");
		System.out.println("roll no :"+s1.rno);
		System.out.println("name :"+s1.sname);
	}

}
