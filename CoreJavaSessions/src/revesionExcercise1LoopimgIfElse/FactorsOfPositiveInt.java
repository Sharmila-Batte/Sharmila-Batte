package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class FactorsOfPositiveInt {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		no=sc.nextInt();
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println(i);
			}
		}


	}

}
