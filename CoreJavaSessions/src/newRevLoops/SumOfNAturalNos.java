package newRevLoops;

public class SumOfNAturalNos {

	public static void main(String[] args) {
		int no=12345;
		int sum=0;
		int temp;
		for(;no!=0;)
		{
			temp=no%10;
			sum=sum+temp;
			no=no/10;
		}
		System.out.println("sum of n natural nos");

	}

}
