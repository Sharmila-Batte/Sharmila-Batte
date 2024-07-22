package com.poly;

class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class RunTime {
	public static void main(String args[]) {
		Animal A = new Animal();
		A.eat();// Animals Eat
		Animal h = new herbivores(); // 
		h.eat();// 
		Animal o = new omnivores(); // 
		o.eat();// 
		Animal c = new carnivores(); // 
		c.eat();//
	}
}