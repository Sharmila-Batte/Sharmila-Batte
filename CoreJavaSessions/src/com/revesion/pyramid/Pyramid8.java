package com.revesion.pyramid;

public class Pyramid8 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
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

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 

*/