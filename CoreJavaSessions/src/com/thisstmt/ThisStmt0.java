package com.thisstmt;
class Test101 {
	Test101() {	
		System.out.println("hello zero");
	}
	Test101(double d) {
		System.out.println("hello double " + d);
	}
	Test101(int x) {
		System.out.println("Hello int " + x);
	}
}
class ThisStmt0 {
	public static void main(String args[]) {
		Test101 t1=new Test101();	
	}
}
