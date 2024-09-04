package com.stringexcercise;

public class RemoveWhitespaceswithoutUsingInbuiltMethod {

	public static void main(String[] args) {
		String str1=" Autom ation Testin g ";
		String str2="";
		System.out.println(str1);
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			str2=str2+str1.charAt(i);
			}
		}
		System.out.println(str2);

	}

}
