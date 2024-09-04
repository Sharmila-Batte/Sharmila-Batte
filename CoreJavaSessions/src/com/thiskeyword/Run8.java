package com.thiskeyword;
class G extends A
{
	G()
	{
		System.out.println("Running default() constructer");
	}
	G(int i)
	{
		//this();
		super(12);
		System.out.println("Running G(int) constructer");
		
		
	}
	G(double d)
	{
		this(23);
		System.out.println("Running G(double) constructer");
		
		
	}
}
public class Run8 {

	public static void main(String[] args) 
	{
	System.out.println("Program Starts");
	G g=new G(54.34);
	A w = new G();

	
	System.out.println("Program Ends");

	}

}

//27, 11,18,30