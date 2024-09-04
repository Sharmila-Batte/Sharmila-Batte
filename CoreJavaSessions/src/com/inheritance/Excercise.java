package com.inheritance;
class Company1 {
	static int empId=2;
	double sal=60000;
	public void printData()
	{
		System.out.println("emp id: "+empId);
		System.out.println("sal: "+sal);
	}
	public void printData(int empId,double sal)
	{
		System.out.println("comp local vari emp id: "+empId);
		System.out.println("comp local vari sal: "+sal);
		this.sal=sal;
		System.out.println("comp nsgv sal: "+this.sal);
		System.out.println("comp nsgv empid: "+this.empId);
	}
	//cons
	Company1()
	{
		this(7,90000);
		System.out.println("comp 0 pram cons...");
	}
	Company1(int empId,double sal)
	{
		System.out.println("comp int double pram cons...");
		System.out.println("comp cons local vari emp id: "+empId);
		System.out.println("comp cons local vari sal: "+sal);
	}
}

class Employee1 extends Company1 {
	static int empId=1;
	double sal=75000;
	public void printData()
	{ 
		super.printData();
		System.out.println("emp class empId: "+empId);
		System.out.println("emp class sal: "+sal);
		System.out.println("comp class sal: "+super.sal);
	}
	public void printData(int empId, double sal)
	{
		super.printData(4, 100000);
		System.out.println("emp class empId: "+empId);
		System.out.println("emp class sal: "+sal);
		this.sal=sal;
		System.out.println("emp class local vari sal: "+sal);
		System.out.println("emp class global vari sal: "+this.sal);
		System.out.println("comp class global vari sal: "+super.sal);
	}
	public Employee1()
	{
		super(11,160000);
		System.out.println("Running employee with no arg constructer");
	}
	public Employee1(int empId,double sal)
	{
		this();
		System.out.println("Running employee with int,double arg constructer");
	}
	
}

public class Excercise {
	public static void main(String[] args) {
		Company1 c1=new Employee1(10,150000);
		c1.printData();
		c1.printData(5,70000);
		
	}

}
