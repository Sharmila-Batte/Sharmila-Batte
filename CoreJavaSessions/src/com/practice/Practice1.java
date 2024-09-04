package com.practice;

import java.util.Scanner;

public class Practice1 {
	static int a, b;
	int c;

	public void getAdd() {
		// int a, b;
		// int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no a:");
		a = sc.nextInt();
		System.out.println("Enter no b:");
		b = sc.nextInt();
		c = a + b;
		System.out.println("Addition of 2 numbers:" + c);

	}

	public static void getSub() {
		// int a, b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no a:");
		a = sc.nextInt();
		System.out.println("Enter no b:");
		b = sc.nextInt();
		c = a - b;
		System.out.println("Subtraction: " + c);

	}

	public int getMul(int a, int b) {
		int c;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter no a:");
		// a = sc.nextInt();
		System.out.println("Enter no b:");
		// b = sc.nextInt();
		c = a * b;
		return c;
	}

	public static void getDiv(int a, int b) {
		int c;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter no a:");
		// a = sc.nextInt();
		System.out.println("Enter no b:");
		// b = sc.nextInt();
		c = a / b;
		System.out.println("Div is: " + c);
	}

	public static void main(String[] args) {

		Practice1 p1 = new Practice1();
		p1.getAdd();
		Practice1.getSub();
		int resultMul = p1.getMul(2, 4);
		System.out.println("Multiplication of 2 numbers is:" + resultMul);
		getDiv(10,5);
	}

}
