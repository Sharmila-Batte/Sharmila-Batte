package com.Blocks;


public class Blocks11 {

	static int age;
	static void print() {
		System.out.println("Age: "+age);
	}
	/* static block or static initialization block or SIB */
	static {
		print();
		System.out.println("******** Running static-block1 of class Blocks1..");
		age=25;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks1 class...");
		print();
		System.out.println("main() ends");
	}
}