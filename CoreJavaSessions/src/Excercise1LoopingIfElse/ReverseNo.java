package Excercise1LoopingIfElse;

public class ReverseNo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int no=1234;
		int reverse=0;
		int remainder;
		
		for(;no!=0;no=no/10)
		{
			remainder=no%10;
			reverse=reverse*10+remainder;
			
		}
		System.out.println("reverse nois:"+reverse);
	}

}
