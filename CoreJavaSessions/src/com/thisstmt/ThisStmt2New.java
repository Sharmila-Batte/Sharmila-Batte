package com.thisstmt;

class A11 {
	A11() {	
		this(10);
		System.out.println("hello zero");
	}
	A11(double d) {
		
		System.out.println("hello double " + d);
	}
	A11(int x) {
		this(35.56);
		System.out.println("Hello int " + x);
	}
}
class ThisStmt2New {
	public static void main(String args[]) {
//		 A1 a1=new A1();
//		 A1 a2=new A1(10);
//		 A1 a3=new A1(10.23);		 
		A11 a1=new A11();
	}
}
