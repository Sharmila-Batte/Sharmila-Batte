package com.predefinedclasses.stringclasses;
final class TestImmutableClass{
	final String name;
	final int salary;
	TestImmutableClass(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
public class ImmutableClass {

	public static void main(String[] args) {
		TestImmutableClass t1=new TestImmutableClass("Pune",15000);
		System.out.println(t1.getSalary());
		System.out.println(t1.getName());
//		t1.name="Bangalore";
//		t1.salary=45000;
		TestImmutableClass t2=new TestImmutableClass("Bangalore",45000);
		System.out.println(t2.getSalary());
		System.out.println(t2.getName());
	}
}