package com.accessmodifier2;
import com.accessmodifier1.*;
class AccessProtectedMembers2 extends ProtectedMembers {

	public static void main(String[] args) {
		
		AccessProtectedMembers2 p1=new AccessProtectedMembers2();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		//you need to import once again for another class like
		DefaultMembers d1=new DefaultMembers();
	}
}