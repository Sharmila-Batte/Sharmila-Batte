package WhileLoop;

public class PalindromNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=1231;
		int rev=0;
		int remainder;
		int temp;
		temp=num;
		while(num!=0) 
		{
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("No is palindrom");
		}
		else
		{
			System.out.println("No is not palindrom");
		}

	}

}
