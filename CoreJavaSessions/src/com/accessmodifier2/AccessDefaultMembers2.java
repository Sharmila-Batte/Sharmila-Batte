package com.accessmodifier2;
import com.accessmodifier1.DefaultMembers;


public class AccessDefaultMembers2 {

	public static void main(String[] args) {
		
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing default members from another class within same package");
		//default members are accessible only within the pkg
		//System.out.println(p1.accNum);
		//p1.displayAccNum();
	}

}
