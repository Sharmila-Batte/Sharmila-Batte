package com.thiskeyword;

class A1 {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		m();
	}
}

class ThisKeyword3 {
	void methodOne() {
		System.out.println("Inside Method ONE");
	}

	void methodTwo() {
		System.out.println("Inside Method TWO");
		methodOne();
	}

	public static void main(String args[]) {
		ThisKeyword3 obj = new ThisKeyword3();
		obj.methodTwo();
		A1 a = new A1();
		a.n();
	}
}
