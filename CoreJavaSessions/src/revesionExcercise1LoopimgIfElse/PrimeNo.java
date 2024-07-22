package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
	int no;
	boolean prime=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
	no=sc.nextInt();
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			prime=false;
			break;
		}
	}
	System.out.println("No is prime? "+prime);
			

	}

}
