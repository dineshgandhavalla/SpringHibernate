package com.Task.June28;

public class Dog {
	
	Dog get(){
		return this;
		}  
		void display(){
		System.out.println("This is an example for covariant return type");
		}  

	public static void main(String[] args) {
		new Dog().get().display();  
	}

}
