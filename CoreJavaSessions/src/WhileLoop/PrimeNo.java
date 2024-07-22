package WhileLoop;

public class PrimeNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=15;
		int count=0;
		int i=1;
		while(i<=num)
		{
			
			if(num%i==0)
			{
				count++;
			}i++;
		}if(count==2)
		{
			System.out.println("No is Prime");
		}else 
		{
			System.out.println("No is not Prime");
		}

	}

}
