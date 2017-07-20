package com.StringManipulations;

public class StringMethodsDemo {

	public static void main(String []args){
		
		String s1 = new String("Welcome to NIIT");
		String s2 = "DT Java with Devops";
		String s3;
		System.out.println("String s1:"+s1);
		System.out.println("String s2:"+s2);
		System.out.println("length of string s1 : "+s1.length());
		s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println("s1 substring with specific end index as 7 :"+s1.substring(0, 7));
		System.out.println("Converting s1 into lower case: "+s1.toLowerCase());
		System.out.println("converting s2 into upper case: "+s2.toUpperCase());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
}
