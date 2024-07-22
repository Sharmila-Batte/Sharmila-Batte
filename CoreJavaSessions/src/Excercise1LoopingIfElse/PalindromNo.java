package Excercise1LoopingIfElse;

public class PalindromNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no=1245,temp;
		int reverse=0;
		int remainder;
		temp=no;
		for(;no!=0;no=no/10) 
		{
			
			 remainder=no%10;
			reverse=reverse*10+remainder;
		}
			if(temp==reverse)
			{
				System.out.println("No is Palindrom");
			}
			else
			{
				System.out.println("No is not palindrom");
			}
		

	}
}
