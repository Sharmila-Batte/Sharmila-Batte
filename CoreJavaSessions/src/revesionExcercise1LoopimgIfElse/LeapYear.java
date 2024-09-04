package revesionExcercise1LoopimgIfElse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// year is leap year if it is divisible by 4 exclude century year i.e. ending with 00, 
		//In case of century year, year is leap year if it is divisible by 400
		int year;
		boolean leap=false;
		System.out.println("Entered the year to check leap or not: ");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					leap=true;
				}
			leap=true;
			}
		System.out.println(year+" is a leap year? : "+leap);

}
}