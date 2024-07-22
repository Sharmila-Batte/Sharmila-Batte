package com.revesion.pyramid;

public class Pyramid3 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
/*
o/p:
1 
1 2 
1 2 3 
1 2 3 4 

*/