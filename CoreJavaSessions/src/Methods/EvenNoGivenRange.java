package Methods;

public class EvenNoGivenRange 
{ 
	public static void evenRange(int start,int end)
	{
		for(;start<=end;start++)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
		}
		
	}

	public static void main(String[] args) 
	{
		evenRange(5,15);

	}

}
