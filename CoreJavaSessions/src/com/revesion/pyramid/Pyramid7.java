package com.revesion.pyramid;

public class Pyramid7 {

	public static void main(String[] args) {
		
       for(int i=0;i<=5;i++)
       {
    	   for(int j=1;j<=5-i;j++)
	       {
    		   System.out.print("*");
    		   System.out.print(" ");
    	   }
    	   System.out.println("");
       }

   }

}
/*
 o/p:
 
* * * * * 
* * * * 
* * * 
* * 
* 

 */
