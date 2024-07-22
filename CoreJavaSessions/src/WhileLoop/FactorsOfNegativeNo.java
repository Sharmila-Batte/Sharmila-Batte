package WhileLoop;

public class FactorsOfNegativeNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no=-15;
		int i=no;
		while(i<=Math.abs(no))
		{
			if(i==0)
			{
				continue;
			}
		else
			{
			if(no%i==0) 
			{
				System.out.println(i);
			}
			++i;
			}
			
		}

	}

}
