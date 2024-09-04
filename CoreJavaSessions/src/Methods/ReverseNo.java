package Methods;

public class ReverseNo 
{
   public int printReverse(int no)
   {
	  
		int reverse=0;
		int remainder;
		
		for(;no!=0;no=no/10)
		{
			remainder=no%10;
			reverse=reverse*10+remainder;
			
		}
		//System.out.println("reverse no is:"+reverse);
		return reverse;
	
   }
	public static void main(String[] args) 
	{
		ReverseNo rn=new ReverseNo();
	    System.out.println(rn.printReverse(1234));
	    System.out.println(rn.printReverse(4567));
	}

}
