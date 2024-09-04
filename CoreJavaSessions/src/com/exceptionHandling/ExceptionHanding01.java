package com.exceptionHandling;
import java.util.Scanner;

public class ExceptionHanding01 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first num1: ");
		i=scn.nextInt();
		System.out.println("Enter first num2: ");
		j=scn.nextInt();
		k= i/j;//ArithmeticException
		System.out.println("res: "+k);	
		System.out.println("Programs ends here...");
	}
}