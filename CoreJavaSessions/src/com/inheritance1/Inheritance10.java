package com.inheritance1;

class Company {
	int age = 10;
	int empId = 12;
	float empSal;

	public void printData() {
		System.out.println("emp id:" + empId);
		System.out.println("emp sal:" + empSal);
	}

	public void printData(int empId, float empSal) {
		System.out.println("Local Variable emp id:" + empId);
		this.empSal = empSal;
		System.out.println("Company Local variable emp sal:" + empSal);
		System.out.println("Company Local variable emp id:" + empId);
		System.out.println("Company instance variable emp id:" + this.empId);
		System.out.println("Company instance variable emp sal:" + this.empSal);
	}

	Company() {
		System.out.println("Running company with no arg constructer");

	}

	Company(int a) {
		this();
		System.out.println("Running company int constructer");
	}

	Company(int empId, float empSal) {
		this(20);
		System.out.println("Running company with int,float constructer");
	}
}

class Employee extends Company {
	int age = 11;
	int empId = 16;
	float empSal;

	public void printData() {
		super.printData();
		System.out.println("age:" + age);
		System.out.println("non static parent class age:" + super.age);
		System.out.println("emp id:" + empId);
		System.out.println("emp sal:" + empSal);
	}

	public void printData(int empId, float empSal) {
		super.printData(3, 37000);
		System.out.println("emp id:" + empId);
		this.empSal = empSal;
		System.out.println("Company Local variable emp id:" + empId);
		System.out.println("Company instance variable emp id:" + this.empId);
		System.out.println("Company Local variable emp sal:" + empSal);
		System.out.println("Company instance variable emp sal:" + this.empSal);
		System.out.println("non static parent class empId:" + super.empId);
		System.out.println("non static parent class empSal:" + super.empSal);
		System.out.println("non static parent class age:" + super.age);
	}

	Employee() {
		System.out.println("Running employee with no arg constructer");
	}

	Employee(int a) {
		// this();
		System.out.println("Running employee with int arg constructer");
	}

	Employee(int empId, float empSal) {
		// this(4);
		super(4, 85000);
		System.out.println("Running employee with int,float arg constructer");
	}

}

public class Inheritance10 {
	public static void main(String[] args) {
//		Company c1 = new Company(30, 50000);
//		System.out.println(".............................................");
//		c1.printData();
//		System.out.println("..............................................");
//		c1.printData(1, 50000);
//		System.out.println("..............................................");
		Employee emp1 = new Employee(3, 65000);
		emp1.printData();
		emp1.printData(5, 74000);

	}

}
