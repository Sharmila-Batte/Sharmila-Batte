package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		no=sc.nextInt();
		int count=0;
	while(no!=0)
	{
		no=no/10;
		count++;
	}
	System.out.println(count);

	}

}
