package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		no=sc.nextInt();
		int rem;
		int rev=0;
		while(no!=0)
		{
			rem=no%10;//for eg no=1234 rem=124%10=4 
			rev=rev*10+rem;//rev=0*10+4
			no=no/10;//no=1234/10=123
		}
		System.out.println("Reverse no is: "+rev);
		

	}

}
