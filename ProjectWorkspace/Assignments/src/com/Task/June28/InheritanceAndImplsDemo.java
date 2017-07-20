package com.Task.June28;

public class InheritanceAndImplsDemo extends AbstractDemo implements InterfaceDemo {

	@Override
	public void display() {
		System.out.println("this is a display method available in abstract class and overidden method");
		
	}

	@Override
	public void input() {
		System.out.println("this is an inteface method used for input");
		}

	@Override
	public void operation() {
		System.out.println("this method is used for performing the operations and it is available in interface");
		
	}

}
