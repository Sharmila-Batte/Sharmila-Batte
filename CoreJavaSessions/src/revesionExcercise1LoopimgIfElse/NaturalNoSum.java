package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class NaturalNoSum {

	public static void main(String[] args) {
		int no;
		int sum =0;
		System.out.println("Enter no: ");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		while(no>0)
		{
			sum=sum+no;
			no--;
		}
		System.out.println("Sum of natural no is: "+sum);
		/*
		 sum=no*((no+1))/2;
		 System.out.println(sum);
		 
		 */

	}

}
