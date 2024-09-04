package com.revesion.pyramid;

import java.util.Scanner;

public class NamePyramid {

	public static void main(String[] args) {
		 System.out.println("What is your name?");
		    Scanner console = new Scanner(System.in);

		    String name = console.next().toLowerCase(); 
		    printPyramid(name);

}
	 public static void  printPyramid(String name) {


		 for (int i = 0; i < name.length(); i++) {
		        for (int j = 0; j<=i; j++) {
		            System.out.print(name.charAt(i));
		        }
		        System.out.println();
		    }
		}
}
