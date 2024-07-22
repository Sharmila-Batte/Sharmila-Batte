package com.predefinedclasses.stringclasses;


import java.util.Arrays;

public class Demo101 {

	public static void main(String[] args) {
		literalObject();
		System.out.println("*********************************************");
		newKeywordObject();
		System.out.println("*********************************************");
		String s1 = "Bangalore";
		String s2 = new String("Bangalore");// single object, outside SCP
		System.out.println("String object s1 & s2 with equals(): " + s2.equals(s1));
		System.out.println("String object s2 & s1 with '==': " + (s2 == s1));
		
		System.out.println("s1 object char count: "+s1.length());
		System.out.println("s2 object char count: "+s2.length());
		
		System.out.println("s1, char at index 2: "+s1.charAt(2));
		System.out.println("**********************************");
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
	}

	static void newKeywordObject() {
		String s2 = new String("Bangalore");// two object, 1st-SCP & 2nd-outside SCP
		String s3 = new String("Mumbai");// two object, 1st-SCP & 2nd-outside SCP
		String s4 = new String("Bangalore");// single object,1st-outside SCP
		String s5 = new String("Pune");// single object,1st-outside SCP
		System.out.println("String object s2 & s3 with equals(): " + s2.equals(s3));
		System.out.println("String object s2 & s4 with equals(): " + s2.equals(s4));
		System.out.println("String object s2 & s5 with equals(): " + s2.equals(s5));

		System.out.println("String object s2 & s4 with '==': " + (s2 == s4));
		System.out.println("String object s2 & s3 with '==': " + (s2 == s3));
		System.out.println("String object s2 & s5 with '==': " + (s2 == s5));
	}

	static void literalObject() {
		String s1 = "Pune";
		System.out.println("String object s1: " + s1);
		String s2 = "Mumbai";
		System.out.println("String object s2: " + s2);
		String s3 = "Pune";
		System.out.println("String object s3: " + s3);
		System.out.println("String object s1 & s2 with equals(): " + s1.equals(s2));
		System.out.println("String object s1 & s3 with equals(): " + s1.equals(s3));
		System.out.println("String object s1 & s2 with '==': " + (s1 == s2));
		System.out.println("String object s1 & s3 with '==': " + (s1 == s3));
	}
}