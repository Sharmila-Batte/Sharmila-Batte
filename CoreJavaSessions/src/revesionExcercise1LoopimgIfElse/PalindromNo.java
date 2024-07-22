package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		int no;
		int rev=0;
		int rem;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		no=sc.nextInt();
		temp=no;
		for(;no!=0;no=no/10)
		{
			rem=no%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse No is: "+rev);
		if(rev==temp)
		{
			System.out.println("No is palindrom");
			
		}else
		{
			System.out.println("No is not palindrom");
		}

	}

}
