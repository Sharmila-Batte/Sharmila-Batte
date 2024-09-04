package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class PositiveNegativeNO {

	public static void main(String[] args) {
		int no;
		System.out.println("Enter the no: ");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		if(no>=0)
		{
			System.out.println(no+" is positive no");
		}
		else
		{
			System.out.println(no+" is negative no");
		}

	}

}
