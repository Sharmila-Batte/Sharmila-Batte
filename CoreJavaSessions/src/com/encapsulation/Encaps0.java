package com.encapsulation;

class Demo{
	private int empID=1000;
	private double salary =45000;
	/*generate getter for empID and salary*/
	public int getEmpID() {
		return empID;
	}
	public double getSalary() {
		return salary;
	}
	/*generate setter for empID and salary*/
	public void setEmpID(int id) {
		empID=id;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Encaps0 {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
//		System.out.println(d1.empID);// compile time error
//		System.out.println(d1.salary);// compile time error
		System.out.println("Accessing private data member outside the class using getter concept- empID: "+d1.getEmpID());
		System.out.println("Accessing private data member outside the class using getter concept- salary: "+d1.getSalary());
		System.out.println("*****************Updating private data members*************************");
		d1.setEmpID(1001);
		d1.setSalary(550000);
		System.out.println("Updated, Accessing private data member outside the class using getter concept- empID: "+d1.getEmpID());
		System.out.println("Updated, Accessing private data member outside the class using getter concept- salary: "+d1.getSalary());
		System.out.println("***********************************");
		Demo d2=new Demo();
		System.out.println("Accessing private data member outside the class using getter concept- empID: "+d2.getEmpID());
		System.out.println("Accessing private data member outside the class using getter concept- salary: "+d2.getSalary());
	}
}