package com.thiskeyword;

public class StaticGlobalVariableExample1 {
	static int age=35;
	double salary=45000.56;
	void display(double salary) {
		System.out.println("local salary display: "+salary);
		StaticGlobalVariableExample1 obj=new StaticGlobalVariableExample1();
		System.out.println("NSGV1 salary display: "+obj.salary);
		obj.salary=salary;//
		System.out.println("Local variable salary display: "+salary);//65000.56
		System.out.println("NSGV2 salary display : "+obj.salary);//65000.56
		System.out.println("*******************************");
	}
	void printVariable(double salary) {
		System.out.println("local salary printVariable: "+salary);
		System.out.println("NSGV salary printVariable: "+this.salary);
		this.salary=salary;
		System.out.println("Local variable salary printVariable: "+salary);//
		System.out.println("NSGV salary printVariable: "+this.salary);//
		System.out.println("this keyword value printVariable: "+this);
		System.out.println("*******************************");
	}
	public static void main(String[] args) {
		System.out.println("age main: "+age);
		int age=25;
		System.out.println("local age main: "+age);
		System.out.println("GSV age main: "+StaticGlobalVariableExample1.age);
		System.out.println("*******************************");
		StaticGlobalVariableExample1 s1=new StaticGlobalVariableExample1();
		s1.display(65000.56);
		s1.printVariable(85000);
		System.out.println("Value of Object created by me: "+s1);
	}
}