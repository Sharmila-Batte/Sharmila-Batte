package Methods;

public class PalindromNo
{

	public static boolean checkPalindrom(int no)
	{
		int temp;
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
				return true;
				//System.out.println("No is Palindrom");
			}
			else
			{
				return false;
				
				//System.out.println("No is not palindrom");
			}
			
			
	}
	public static void main(String[] args) 
	{
		 System.out.println(checkPalindrom(1221));
		 System.out.println(checkPalindrom(1231));

	}

}
