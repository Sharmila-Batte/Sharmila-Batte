package com.exceptionHandling;

class ShaileshExceltion extends Exception {
	public ShaileshExceltion(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  
public class ExceptionHandling12 {

	public static void validateAge(int age) throws ShaileshExceltion {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ShaileshExceltion("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String args[]) throws ShaileshExceltion {
	
		System.out.println("Hello");
		validateAge(15);
		System.out.println("Rest of the code..");
	}
}
