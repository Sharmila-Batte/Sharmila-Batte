package com.stringexcercise;

public class RemoveWhitespacesUsingInbuiltMethod {

	public static void main(String[] args) {
	String str1=" Automation Test  ing ";
	//System.out.println(str1.replaceAll(" ",""));
	String str2=str1.replaceAll("\\s","");
	System.out.println(str1);
	System.out.println(str2);
	}

}
