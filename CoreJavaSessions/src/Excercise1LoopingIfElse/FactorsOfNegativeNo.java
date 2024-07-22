package Excercise1LoopingIfElse;

public class FactorsOfNegativeNo {

	public static void main(String[] args) {
		int no=-15;
		for(int i=no;i<=Math.abs(no);i++)
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
			}
				
		}

	}

}
