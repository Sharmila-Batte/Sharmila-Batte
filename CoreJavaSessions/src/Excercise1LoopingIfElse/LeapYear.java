package Excercise1LoopingIfElse;

public class LeapYear {

	public static void main(String[] args) 
	{
		
		//year is leap year when is divided by 4 exclude century year. In case of centuray year, 
		//year is leap when it is divided by 400
		int year=2006;
		boolean leap=false;
		
		if(year%4==0)
		{
			if(year%100==0)
				
				if(year%400==0)
				
				//leap=true;
					System.out.println(year+" is leap Year");
				else
					//leap=false;
					System.out.println(year+" is not leap Year");
				
			else
				//leap=true;
				System.out.println(year+" is leap Year");
		}
		else
			//leap=false;
		System.out.println(year+"is not leap year");
	
		}
					
		
			

	}

