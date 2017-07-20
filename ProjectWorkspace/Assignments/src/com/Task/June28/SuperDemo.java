package com.Task.June28;

class WildAnimals{
	void example(){
		System.out.println("Tiger, Lion ,Cheetah etc., are wild animals ");
	}
}

class Tiger extends WildAnimals{
	Tiger(){
		System.out.println("Tiger eats only alive animals by hunting");
	}
	void work(){
		System.out.println("this is super keyword example");
		System.out.println("Tiger is Roaring");
		super.example();
	}
}

class BengalTiger extends Tiger{
	BengalTiger(){
		super();
		System.out.println("this is super() example");
	}
}
public class SuperDemo {
	public static void main(String []args){
		Tiger t= new Tiger();
		t.work();
		System.out.println();
		BengalTiger bt = new BengalTiger();
	}
}
