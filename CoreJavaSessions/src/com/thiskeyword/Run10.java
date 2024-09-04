package com.thiskeyword;
class E
{
	static {
		System.out.println("Inside the static block !!");
	}
	{
		System.out.println("Running non static block");
	}
	E()
	{
		System.out.println("Running E() constructor");
	}
}
public class Run10 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		E e1=new E();
		System.out.println(".............");
		E e2=new E();
		System.out.println("Program Ends");

	}

}

// static block executed at class level means once at a class.
// non static block will call when the object creation "object call = instance block call ".

//Program Starts
//Running non static block
//Running E() consructer
//.............
//Running non static block
//Running E() consructer
//Program Ends



//Program Starts
//Insid the static block !!
//Running non static block
//Running E() consructer
//.............
//Running non static block
//Running E() consructer
//Program Ends