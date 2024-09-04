package WhileLoop;

public class FactorsOfPositiveNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no=15;
		int i=1;
		
		while(i<=no)
		{
			if(no%i==0)
			{	
				System.out.println("Factors are:"+i);
				
			}
			i++;
		}
	

	}

}
