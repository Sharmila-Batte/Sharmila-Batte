package WhileLoop;

public class ReverseNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=1231;
		int rev=0;
		int remainder;
		
		while( num!=0)
		{
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse no is:"	+rev);
	

	}

}
