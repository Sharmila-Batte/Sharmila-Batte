package com.accessmodifier2;

public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		 com.accessmodifier1.PublicMembers p1=new  com.accessmodifier1.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		 com.accessmodifier1.PublicMembers p2=new com.accessmodifier1.PublicMembers();
		
	}
}