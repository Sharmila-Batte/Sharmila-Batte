package newRevLoops;

public class LeapYear {

	public static void main(String[] args) {
		int year=2008;
		if(year%4==0 && year%100!=0  || year%400==0)
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}

	}

}
